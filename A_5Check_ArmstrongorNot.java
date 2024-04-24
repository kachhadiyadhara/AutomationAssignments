package AssignmentModule_3_Corejava;
import java.util.Scanner;

public class A_5Check_ArmstrongorNot {
	public static void main(String[] args) {
		
//		W.A.J.P to check given number is Armstrong or not?
//		1
//		01
//		101
//		01010
//		101010
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		
		System.out.println("Enter num1");
		int num1= sc.nextInt();
		int num2 = num1;int rem = 0; int sum=0;
		
		while(num1!=0)
		{
			rem = num1%10;
			sum = sum+(rem*rem*rem);
			num1= num1/10;
		}
		if (num2==sum)
		{
			System.out.println(num2+": Is An Armstrong Number");
		}
		else
		{
			System.out.println(num2+ ": Is Not An Armstrong Number");
		}
	}

}
