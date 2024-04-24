package AssignmentModule_3_Corejava;

public class A_4Check_PrimeOrNot {
	public static void main(String[] args) {
	//  **W.A.J.P to check given number is Prime or not?**
		//2)
		//1
		//12
		//123
		//1234
		//12345
               
		int a = 12345;int prime=0;
               
		for(int i = 2;i<a;i++)
               {
            	   if (a%i==0)
            		   prime = 1;
            	   
            	        break;
               }
            	   
            	if(prime==1)
            	   {
            		   System.out.println(a+ " : is a  not prime number");
            	   }
            	else 
            	   {
            		   System.out.println(a+ " : is prime number");
            	   }
            		   
    }


}
