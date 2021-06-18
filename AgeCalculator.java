package day1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.Scanner;
public class AgeCalculator {
	static int calculateAge(String dob) throws ParseException{
		 SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
	      Date date = formatter.parse(dob);
	      Instant instant = date.toInstant();
	      ZonedDateTime zone = instant.atZone(ZoneId.systemDefault());
	      LocalDate givenDate = zone.toLocalDate();
	      Period period = Period.between(givenDate, LocalDate.now());
	      return period.getYears();
	}
	public static void main(String args[]) throws ParseException {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter your date of birth (dd-MM-yyyy): ");
	      String dob = sc.next();
	      System.out.println(calculateAge(dob));
	     
	   }

}
