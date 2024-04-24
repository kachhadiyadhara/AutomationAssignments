package AssignmentModule_3_Corejava;

//WAP to find the second largest element in an array.

public class A_17SacondLargestElements {
	public static void main(String[] args) {
		
		int[] a = {10,20,30,40,50,60,70,90,100};
		int largest = a[0];
		int second_largest=a[0];
		
		for (int i = 0; i < a.length; i++) 
		{
			
			if (largest <a[i])
			{
				  second_largest=largest;
				  largest=a[i];
			}
			
		}
		System.out.println("Largest elements: " + largest);
		System.out.println("second largest : "+ second_largest);
		
		
		
	}
	

}
