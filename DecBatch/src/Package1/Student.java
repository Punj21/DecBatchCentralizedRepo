package Package1;

public class Student 
{

	int rollno; //variable declaration
	int age;  //variable declaration
	
	public void display1() //user defined method
	
	{
		System.out.println("Welcome to all of you");
	}
	
	public void display2() //user defined method
	
	{
		System.out.println("Automation is very easy");
	}
	
	public static void main(String[] args) //main method entry... point
	{
		Student punj = new Student(); //object creation
		
		punj.rollno = 11;   //assigning value (roll no) through object
		
		punj.age = 30;     //assigning value (age) through object
		
		punj.display1();   //calling method 1 through object
		
		punj.display2();   //calling method 2 through object
		
		System.out.println("Student roll Number "+punj.rollno);  //printing variable value
		
		System.out.println("Stedent age in years "+punj.age);    //printing variable value
	}
}
