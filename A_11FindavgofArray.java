package AssignmentModule_3_Corejava;

public class A_11FindavgofArray {
	public static void main(String[] args) {
		int a[]= {10,30,40,50,60,70,100};
		int sum=0;
		
		for (int i = 0; i < a.length; i++)
		{
			sum+=a[i];
			
		}
		System.out.println("Avarage of Array: "+sum/a.length);
	}

}
