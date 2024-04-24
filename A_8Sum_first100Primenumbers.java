package AssignmentModule_3_Corejava;

public class A_8Sum_first100Primenumbers {
	public static void main(String[] args) {
		
		   int sum=0,totalprimenumber=0;
		   
		
		for( int num1=3;num1<=100;num1++)
		{  int store = num1;
		    int count=0;
		
			for(int i = 2;i<num1;i++)
			{
				if(num1%i==0)
				{
					count=1;
					break;
					
				}
			}
			if(count==1)
					{
					System.out.println(num1+": is not a prime number");
					}
		   else
				    {	
				
					System.out.println(num1+": is a prime number");
					totalprimenumber++;
				    }
			
		
		   if(count!=1)
				{
					sum = sum+num1;
				}
		}
				System.out.println("Total prime number are between 1 to 1oo: "+totalprimenumber);
				System.out.println("Sum of prime number between 1 to 100 are: "+sum);
			
		
		
			
		
		 
	}
	

}
