package day1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DateGenertor {
	static Date getDate(String s) throws ParseException {
		SimpleDateFormat date= new SimpleDateFormat("dd/MM/yyyy");
		Date date1=date.parse(s);
		return date1;
	}
	public static void main(String[] args) throws ParseException {
		Date dt = getDate("17/6/2021");
		System.out.println(dt);
	}
}
