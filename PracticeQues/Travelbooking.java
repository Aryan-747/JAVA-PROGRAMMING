import java.util.Scanner;

class TravelBooking
{
	void book()
	{
		System.out.println("Booking a travel service");
	}
}

class FlightBooking extends TravelBooking
{
	String dest;
	
	void book()
	{
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Destination for flight booking: ");
		dest = inp.nextLine();
		
		System.out.println("Flight booked");
	}
}

class HotelBooking extends TravelBooking
{
	String hname;
	
	void book()
	{
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Hotel name for booking: ");
		hname = inp.nextLine();
		
		System.out.println("Hotel booked");
	}
	
}



public class Travelbooking{
    public static void main(String[] args) {
        TravelBooking genericBooking = new TravelBooking();
        genericBooking.book();

        FlightBooking flightBooking = new FlightBooking();
        flightBooking.book();

        HotelBooking hotelBooking = new HotelBooking();
        hotelBooking.book();
    }
}
