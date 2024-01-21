package inheritance;

public class Method_Overloading {
public void flightDetial(String flightname) 
{
	System.out.println(flightname);
}
public void flightDetial(int number,long runway,char clear)
{
	System.out.println(number+" "+runway+" "+clear);
}
public void flightDetail(String domastic,float layout)
{
	System.out.println(domastic+" "+layout);
} 
public void flightDetail(float engincheck,String start)
{
	System.out.println(engincheck+" "+start);

}
public static void main(String[] args) {
	// TODO Auto-generated method stub

		
Method_Overloading s = new Method_Overloading();

s.flightDetial(47,1, 'c');
s.flightDetail("bangalore", 4.12f);
s.flightDetail(98.0f, "viv");
s.flightDetial("lufthansa");
	}

}
