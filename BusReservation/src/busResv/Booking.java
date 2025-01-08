package busResv;
import java.util.*;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Booking {
	String passengerName;
	int busNo;
	Date date;
	
	static Scanner sc=new Scanner(System.in);
	
	public Booking(){
		System.out.print("Enter name of passenger: ");
		passengerName=sc.next();
		System.out.print("Enter Bus No:");
		busNo=sc.nextInt();
		System.out.print("Enter date dd-mm-yyyy:");
		String date_input=sc.next();
		SimpleDateFormat dateformat=new SimpleDateFormat("dd-MM-yyyy");
		try {
			date= dateformat.parse(date_input);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	public boolean isAvailable()throws SQLException {
		BusDAO busdao= new BusDAO();
		BookingDAO bookingdao= new BookingDAO();
		int capacity=busdao.getCapacity(busNo);
		
		int booked = bookingdao.getBookedCount(busNo,date);
		return capacity>booked;
	}
	
	
}
