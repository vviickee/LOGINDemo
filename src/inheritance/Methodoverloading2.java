package inheritance;

public class Methodoverloading2 {
public void  flightname(String flightname)
{
	System.out.println(flightname);
}
	public void flightname(long num, int reg) 
	{
		System.out.println(num+reg);
	}
	public void flightname(int num,String runway)
	{
		System.out.println(num+runway);
	}
	public static void main(String[] args) {
		{
			Methodoverloading a = new Methodoverloading();
		}
	}

}
