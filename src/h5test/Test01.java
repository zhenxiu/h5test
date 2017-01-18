package h5test;

import java.text.SimpleDateFormat;

import org.joda.time.LocalDate;

public class Test01 {

	public static void main(String[] args) {
//		LocalDate localDate = LocalDate.now().plusDays(-1);
//		System.out.println(localDate);
//		
//		convert(localDate,localDate);
		
		LocalDate yesterday = LocalDate.now().minusDays(1);
		
		SimpleDateFormat format = new SimpleDateFormat( "yyyy-MM-dd" );
		
		String string = format.format(yesterday.toDate());
		System.out.println(string);
		
	}
	
	public static void convert(LocalDate start,LocalDate end){
		int num = (int) ((end.toDate().getTime() - start.toDate().getTime())/(1000*60*60*24));
		System.out.println(start.plusDays(num+1));
	}
}
