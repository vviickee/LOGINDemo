package inheritance;

public class Constructor1 {
public Constructor1() {
	this("KIA");
	System.out.println("Bike Detail");
}
public Constructor1(String carName)
{
	this(1234);
	System.out.println(carName);
}
public Constructor1(int regNumber)
{
	System.out.println(regNumber);
	
}
	public static void main(String[] args) {
		Constructor1 a = new Constructor1();

	}

}
