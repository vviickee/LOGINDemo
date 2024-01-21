package hyraricalinheritance;

public class Southern_Railway_TicketBooking {

	String name;
	int age;
	double amount;
	String from;
	String to;
	// constructor
	public Southern_Railway_TicketBooking()
	{
		
	}
		
	public Southern_Railway_TicketBooking(String name, String from, String to) {
		this.name=name;
		this.from=from;
		this.to=to;
	}
public Southern_Railway_TicketBooking(int age,double amount) {
	this("vicky","bangalore","pune");
	this.age=age;
	this.amount=amount;
}
 public void detailPassenger() {
	 System.out.println("Passenger name:"+name);
	 System.out.println("Passenger age:"+age);
	 System.out.println("Ticket Amount:"+amount);
	 System.out.println("from:"+from);
	 System.out.println("to:"+to); 
}
public static void main (String[] args)
{
	Southern_Railway_TicketBooking a = new Southern_Railway_TicketBooking(23,40);
	a.detailPassenger();
			
}
	}
 