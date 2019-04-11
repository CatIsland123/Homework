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
}
}
