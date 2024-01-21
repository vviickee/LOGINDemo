package org.Abstraction;

public class Interface3 implements Interface,Interface1,Interface2{


	

	@Override
	public void flightDuration()
	{
	System.out.println("one_hour");
	}

	@Override
	public void flightReturn() 
	{
    System.out.println("sameday");
	}

	@Override
	public void flightLayout() 
	{
	System.out.println("four_hour");
	}

	@Override
	public void flightEngen()
	{
	System.out.println("rollsroyalls");
	}

	@Override
	public void flightDepart()
	{
    System.out.println("11am");
	}
 
	@Override
	public void flightArivl()
	{
    System.out.println("12pm");
	}

	@Override
	public void flightName() 
	{
    System.out.println("lufthansa");
	}

	@Override
	public void flightNumb()
	{
    System.out.println("a230");
	}

	@Override
	public void flightDeck()
	{
	System.out.println("double");
	}

    public static void main(String[] args) {
    	Interface3 c = new Interface3();
    	c.flightArivl();
    	c.flightDepart();
    	c.flightDuration();
    	c.flightEngen();
    	c.flightName();
    	c.flightReturn();
    	c.flightNumb();
    	c.flightLayout();
    	c.flightDeck();
    }
} 