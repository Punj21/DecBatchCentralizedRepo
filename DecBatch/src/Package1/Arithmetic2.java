package Package1;

public class Arithmetic2 
{
	public int Multi(int a, int b)
	{
		int c;
		c=a*b;
		return c;
	}
	public int Sub(int d, int e)
	{
		int f;
		f=d-e;
		return f;	
	}
	public int Sum(int g, int h)
	{
		int i;
		i=g+h;
		return i;
	}
	public void Div(int j, int k)
	{
		int l;
		l=j/k;
		System.out.println("Final Result is "+l);
	}
	public static void main(String[] args) 
	{
		System.out.println("Assignment 2 ((((10*2)-2)+2)-2)/2)");
		Arithmetic2 obj= new Arithmetic2();
		int Multiresult=obj.Multi(10, 2);
		System.out.println("Result of Multiplication "+Multiresult);
		int Subresult1 =obj.Sub(Multiresult, 2);
		System.out.println("Result of 1st Substraction "+Subresult1);
		int Sumresult= obj.Sum(Subresult1, 2);
		System.out.println("Result of Addition "+Sumresult);
		int Subresult2=obj.Sub(Sumresult, 2);
		System.out.println("Result of 2nd Substraction "+Subresult2);
		obj.Div(Subresult2, 2);
	}

}
