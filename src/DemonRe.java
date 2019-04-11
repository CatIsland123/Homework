import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    
	
	}

}
