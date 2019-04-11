import java.awt.Rectangle;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class DemonRe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//第一题
       System.out.println("(0000)0000-0000".matches("\\(\\d{4}\\)\\d{4}-\\d{4}"));
	   /*
       String bString="故障PROBLE,服务器:181.116.222.88发生: CPU空闲5分钟内小于20%故障!";
       String regEx="((2[0-4]\\d|25[0-5]|[01]?\\d\\d?)\\.){3}(2[0-4]\\d|25[0-5]|[01]?\\d\\d?))"; 
       Pattern p = Pattern.compile(regEx); 
       Matcher m = p.matcher(bString); 

       while (m.find()) {
       String result=m.group();
       System.out.println(result);
       //break;   加break则提取string中的一个IP
       }
       */
       
       //第二题
       String str="故障PROBLE,服务器:181.116.222.88发生: CPU空闲5分钟内小于20%故障!";
       Pattern p=Pattern.compile("(\\d{1,3}\\.)\\d{3}\\.\\d{1,3}\\.\\d{2}");
       Matcher m=p.matcher(str);
       while(m.find()) {
    	   String temp=m.group();
    	   System.out.println("ip为："+temp);
       }
       //(3)
       String str1="caaammabbbbbssssdddd";
       String resultStr1=str1.replaceAll("(.)(\\1)*","$2");
       System.out.println("压缩后的字符为："+resultStr1);
       //(4)
       /*
       //(5)
       JOptionPane email = new JOptionPane();
       email.setBounds(new Rectangle(104, 95, 233, 135));
       String Email = email.showInputDialog("邮箱:");
       Pattern e=Pattern.compile("(\\d{6,12}\\@)\\w{2}\\.\\w{3}");
       String e1="(\\d{6,12}\\@)\\w{2}\\.\\w{3}";
       Matcher m1=e.matcher(Email);
       while(m1.find()) {
    	   String temp=m1.group();
    	   System.out.println("邮箱为："+temp);
    	   System.out.println(Email.matches(e1));
       }
       */
       //(6)
        
       String abcStr = "12x34abc";
       String reg="\\w+$";
       System.out .println(abcStr.matches(reg));
	}
	

}
