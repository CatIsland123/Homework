import java.text.Format;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.Scanner;

public class DemonData {

	public static void main(String[] args) {
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
    
     LocalDate myDateTime = LocalDate.parse("2001-01-19", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
     System.out.println(myDateTime);
     //System.out.println(myDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM,FormatStyle.MEDIUM )));
	
	
	
	}
	

}
