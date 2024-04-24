package AssignmentModule_3_Corejava;

//W.A.J.P. Create an abstract class 'Parent' with a method 'message'. It
//has two subclasses each having a method with the same name
//'message' that prints "This is first subclass" and "This is second
////subclass" respectively Call the methods 'message' by 
//creating an object for each subclass.

abstract class Parent
{
	abstract public void message();
}	

class Firstsubclass extends Parent
{
	public void message()
	{
		System.out.println("This is First SubClass");
	}
}

class Secondsubclass extends Parent
{
	public void message()
	{
		System.out.println("This is Second SubClass");
	}
}
	


public class A_21CreateAbstract {
	public static void main(String[] args) {
		Parent p1 = new Firstsubclass();
		Parent p2 = new Secondsubclass();
		
		p1.message();
		p2.message();
		
		
		
	}

}
