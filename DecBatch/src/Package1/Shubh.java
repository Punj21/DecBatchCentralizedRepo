package Package1;

public class Shubh 
{
	public Shubh() 
	{
		this(13,14,15);
		System.out.println("Default Constructor");
	}
	
	public Shubh(int a) 
	{
		this();
		System.out.println("One Parameterized Constructor");
	}
	
	public Shubh(int a, int b) 
	{
		this(25);
		System.out.println("Two Parameterized Constructor");
	}
	
	public Shubh(int a, int b, int c) 
	{
		System.out.println("Three Parameterized Constructor");
	}
	
	public static void main(String[] args) 
	{
		Shubh obj = new Shubh(11, 12);
	}

}
