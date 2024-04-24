package AssignmentModule_3_Corejava;

public class A_12IndexElementsofArray {
	public static void main(String[] args) {
		
//		 WAP to find the index of an array element.
		
		int[] array = {10,20,30,40,50,60,70};
		int index=0;
		
		for (int i = 0; i < array.length; i++) 
		{
			if(array[i]==60)
			{
				index=i;
			}
		}   System.out.println("Index of an array element: "+ index);
				
		
		
		
	}

}
