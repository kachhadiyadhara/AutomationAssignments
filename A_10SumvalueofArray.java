package AssignmentModule_3_Corejava;

public class A_10SumvalueofArray {
	public static void main(String[] args) {
//		WAP to sum values of an array
		
		int array[] = {10,20,30,40,50,60,70};
		int sum=0;
		
		for (int i = 0; i < array.length; i++)
		{
			sum+=array[i];
			System.out.println("Elements of array "+i+" : "+array[i]);
		}
		
		System.out.println("Total sum of array element : "+sum);
		
		
	}

}
