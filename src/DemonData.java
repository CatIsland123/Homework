import java.text.DateFormat;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class DemonData {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
	/*
     LocalDate curDate=LocalDate.now();
     System.out.println(curDate);
     LocalTime curTime=LocalTime.now();
     System.out.println(curTime);
     LocalDateTime curDateTime=LocalDateTime.now();
     System.out.println(curDateTime);
     System.out.println(curDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT,FormatStyle.SHORT )));
     System.out.println(curDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM ,FormatStyle.MEDIUM  )));
     System.out.println(curDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG,FormatStyle.LONG )));
     System.out.println(curDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL,FormatStyle.FULL)));
    */
		
	/*	
     Scanner s=new Scanner(System.in);
     String myDate=s.next();
     System.out.println(myDate);
     //Date d = new Date();  
     SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd ");  
     Date date ;
	 date = f.parse(myDate);
     System.out.println("现在的日期是：" +date);  
     */
		
		/*
	 Scanner s=new Scanner(System.in);
	 String myDate=s.next();
     // 根据需要解析的日期、时间字符串定义解析所用的格式器
     DateTimeFormatter f1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
     // 执行解析
     LocalDateTime dt1 = LocalDateTime.parse(myDate, f1);
     System.out.println("现在的视觉为："+dt1); // 输出 2014-04-12T01:06:09
*/

     /*
     System.out.println("7天后的日期：" + f.format(new Date(date.getTime() + (long)7* 24 * 60 * 60 * 1000)));
     Calendar ca = Calendar.getInstance();  
     ca.add(Calendar.DAY_OF_MONTH,7);// 7为增加的天数，可以改变的  
     date = ca.getTime();    
     System.out.println("增加天数以后的日期：" +date );  
     */
     //System.out.println(myDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM,FormatStyle.MEDIUM )));
	 
	//修改日期 calendar.setTime(date); 
	 Date d=new Date();
	 System.out.println("当前的时间为："+d);
     Calendar c = Calendar.getInstance();
     c.add(Calendar.DAY_OF_MONTH , 1);
     Date n = c.getTime();
     //String newdateStr = new SimpleDateFormat("yyyy-MM-dd HH:mm:s").format(newdate);
     System.out.println("修改日后的时间为："+n);
     c.add(Calendar.MONTH , 1);
     Date n1 = c.getTime();
     System.out.println("修改月后的时间为："+n1);
     c.add(Calendar.YEAR , 1);
     Date n2 = c.getTime();
     System.out.println("修改年后的时间为："+n2);
	}
	

}
