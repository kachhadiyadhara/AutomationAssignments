package AssignmentModule_3_Corejava;

//WAP to remove the third element from a array list.

public class A_20RemovethirdElementofArray {
	
	public static void main(String[] args) {
		
		int[] array = {10,20,30,40,50,60,70};
		
		int delete_ele = 30;
		
		for (int i = 0; i < array.length; i++) 
		{
			if (delete_ele == array[i])
			{
			
			for (int j = i; j < array.length-1; j++) 
			{
				array[j]=array[j+1];
			}
			
			break;
			}
	}
		for (int i = 0; i < array.length-1; i++) 
		{
			System.out.println(array[i]);
		}
		
		
		
		
	}

}
