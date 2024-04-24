package AssignmentModule_3_Corejava;
import java.util.Scanner;

//**W.A.J.P to find factorial for Given Number**
//1)
//1
//12
//123
//1234
//12345

public class A_3Find_Factorialnumber {
	public static void main(String[] args) {
//		int a = 1;
//		int fact = 1;
//		
//		for(int i= 1;i<=a;i++)
//		{
//			fact = fact*i;
//		}
//		System.out.println("fact of "+fact+ " is " +fact);
//		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		System.out.println("num");
		int num = sc.nextInt();
		
		int fact = 1;
		
		for(int i=1;i<=num;i++)
		{
			fact = fact*i;
		}
		System.out.println("fact of "+num + " is " +fact);
		
		
		
		
		
	}

}
