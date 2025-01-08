package busResv;
import java.util.*;
public class BusDemo {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)throws Exception {
		boolean flag=true;
		
		BusDAO busdao = new BusDAO();
		
		
		do {
			System.out.println("\t\tWelcome to JK Bus Services");
			busdao.displayBusInfo();
			System.out.println("\t1.Bus Booking\n\t2.Exit");
			System.out.print("Enter a input: ");
			int user_input=sc.nextInt();
			switch(user_input) {
			case 1:{
					Booking booking=new Booking();
					if(booking.isAvailable()) {
						BookingDAO bookingdao=new BookingDAO();
						bookingdao.addBooking(booking);
						System.out.println("Your Booking is confirmed");
					}
					else
						System.out.println("Sorry. Bus is full. Try another bus or date.");
					break;
				}
			case 2:{
				flag=false;
				break;
			}
			default:{
				System.out.println("Please enter correct input...");
				break;
			}
		}
		
		}while(flag);
		System.out.println("Thanks for using JK BUS SERVICES");
		
	}
	
}
