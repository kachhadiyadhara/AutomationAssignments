package AssignmentModule_3_Corejava;

//WAP to Copy one array into another

public class A_15CopyArrayIntoOnther {
	public static void main(String[] args) {
		
		int a[] = {10,20,30,40,50,60};
		
        int b[] = new int[a.length];
		
        for (int i = 0; i < b.length; i++) 
		{
	          b[i]=a[i];
			System.out.println(b[i]);
		}
		
	}

}
