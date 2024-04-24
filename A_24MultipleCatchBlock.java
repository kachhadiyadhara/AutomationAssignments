package AssignmentModule_3_Corejava;

public class A_24MultipleCatchBlock {
	public static void main(String[] args) {
		
		System.out.println("Multiple Catch Block ");
		try
		{
		
		int a = 10;
		int j = a/0;
		
		System.out.println(j);
		
		
				
		}
		
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		try
		{
			int array[]= new int [7];
			array[9] = 50;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		System.out.println("program ended");
		
		
		
		
		
	}

}
