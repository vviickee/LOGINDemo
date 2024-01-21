package inheritance;

public class Multilevel_inheritance3  extends   Multilevel_inheritance {
	public void flightnum()
	{
		System.out.println("456");
	}
	public void flightoff()
	{
		System.out.println("46");
	}
	public void  flighttick()
	{
		System.out.println("2889");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multilevel_inheritance3 a = new Multilevel_inheritance3();
		a.flightcompany();
		a.flightowner();
		a.flightname();
		a.flightnum();
		a.flighttick();
	}

}
