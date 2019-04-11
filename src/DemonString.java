import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DemonString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  s="this is a test of java";
		int n=s.split("s").length-1 ;
		System.out.println("S的个数为："+n);
		String newS=s.substring(10, 14);//空格也算一个
		System.out.println("新的test为："+newS);
		String[]str=s.split(" ");
		System.out.println("数组为："+Arrays.toString(str ));
		StringBuffer a=new StringBuffer(s);
		Pattern p=Pattern.compile("[a-z]+\\s*");
		Matcher m=p.matcher(a);
		while (m.find()) {
		String temp=m.group();
		a.replace(m.start(0), m.start()+1, temp.substring(0,1).toUpperCase());
		}
	    System.out.println("首字母大写的新字符串："+a);
		
}
}
