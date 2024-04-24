  package AssignmentModule_3_Corejava;
  
//  WAP to demonstrate try catch block.
  
public class A_23TryCatchBlock {
	public static void main(String[] args) {
		
		System.out.println("Strat program for Arithmetic Solutions");
		try
		{
		  int a = 10;
		  
		  int b = a/0;
		  System.out.println(b);
		  }
		
		catch(ArithmeticException e)
		{
		
			e.printStackTrace();
			
		}
		
		System.out.println("Arithmetic Program ended");
		
	}
	
	


}
