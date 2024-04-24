package AssignmentModule_3_Corejava;

public class A_6Create_FibonacciSeries {
	public static void main(String[] args) {
		//W.A.J.P for create Fibonacci Series
//		1
//		2 2
//		3 3 3
//		4 4 4 4
		int num1 = 7;
		int a = 0;
		int b = 1;
		System.out.print(a+ " " +b);
		for (int i = 1; i<=num1; i++)
		{
			int c = a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
		
		
	}

}
