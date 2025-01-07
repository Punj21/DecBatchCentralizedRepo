package Package1;

public class Arithmetic 
{
	public int Sum(int a, int b)
	{
		int c;
		c=a+b;
		return c;
	}
	
	public int Sub(int x, int y)
	{
		int z;
		z=x-y;
		return z;
	}
	public int Multi(int d, int e)
	{
		int f;
		f=d*e;
		return f;
	}
	public void Div(int g, int h)
	{
		int k;
		k=g/h;
		System.out.println("Final Result is "+k);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Assignment 1 ((((10+2)+2)-2)*2)/2)");
		Arithmetic punj = new Arithmetic();
		int Sumresult=punj.Sum(10, 2);
		System.out.println("Result of Sum1 is "+Sumresult);
		int Sumresult2=punj.Sum(Sumresult, 2);
		System.out.println("Result of Sum2 is "+Sumresult2);
		int Subresult=punj.Sub(Sumresult2, 2);
		System.out.println("Result of Substraction is "+Subresult);
		int Multiresult=punj.Multi(Subresult, 2);
		System.out.println("Result of Multiplication is "+Multiresult);
		punj.Div(Multiresult, 2);	
				
	}

}
