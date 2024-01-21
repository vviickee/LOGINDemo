package inheritance;

public class Application {

public void Student_nam(String Name, int a)
{
	System.out.println("Name:"+ Name);
	System.out.println("Age:"+a);

}
public void address(String address)
{
	System.out.println("address:"+ address);
}
public void Newaddress(String Newaddress)
{
	System.out.println("Newaddress:"+ Newaddress);
}
public void Dob(int a,char b,int c,char d,int e)
{
	System.out.println("Dob:"+ a+ b+ c+ d+ e);
}
public void Gender(String Gender) 
{
	System.out.println("Gender:"+ Gender);
}
public void community(String community)
{
	System.out.println("communiyt:"+ community);
}
public void Nationality(String Nationality)
{
	System.out.println("Nationality:"+ Nationality);
}
public void father_nam( String father_nam)
{
	System.out.println("father_nam:"+ father_nam );
}
public void mother_nam(String mother_nam)
{
	System.out.println("mother_nam:"+ mother_nam);
}
public void  phone_num(long a)
{
	System.out.println("phone_num:"+ a);
}
public void streamjoind(String streamjoind)
{
	System.out.println("streamjiond:"+ streamjoind);
}

	public static void main(String[] args) 
	{
		Application s = new Application();
s.Student_nam("vicky", 18);
s.Gender("male");
s.community("xxx");
s.father_nam("rashibath");
s.mother_nam("kaveri");
s.Nationality("indian");
s.Dob(05, '/', 03, '/', 98);
s.address("bajanai kovil 4th street");
s.Newaddress("same as address");
s.streamjoind("computer science");
s.phone_num(9940633374l);
	}

}
