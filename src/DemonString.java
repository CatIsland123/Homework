import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DemonString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  s="this is a test of java";
		int n=s.split("s").length-1 ;
		System.out.println("S的个数为："+n);
		//(2)
		String newS=s.substring(10, 14);//空格也算一个
		System.out.println("新的test为："+newS);
		//(3)
		String[]str=s.split(" ");
		System.out.println("数组为："+Arrays.toString(str ));
		//(4)
		StringBuffer a=new StringBuffer(s);
		Pattern p=Pattern.compile("[a-z]+\\s*");
		Matcher m=p.matcher(a);
		while (m.find()) {
		String temp=m.group();
		a.replace(m.start(0), m.start()+1, temp.substring(0,1).toUpperCase());
		}
	    System.out.println("首字母大写的新字符串："+a);
	    
	   //(5)
	    StringBuffer b=new StringBuffer(s);
	    System.out.println("第一种倒序："+b.reverse());
	     char  [] b1=s.toCharArray();
	   // String resultStr = null ;
	    StringBuffer c=new StringBuffer();
	    for(int i=b1.length-1 ;i>=0;i--) {
	       c.append(b1[i]);
	    }
	    System.out.print("第二种倒序为："+c);
	    //(6)
	    System.out.println();
	    String [] d=s.split(" ");
	    System.out.println("有意义的单词:"+Arrays.toString(d));
		
}
}
