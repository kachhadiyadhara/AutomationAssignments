package AssignmentModule_3_Corejava;
//WAP to update specific array element by given element.

public class A_18UpdateArray {
	public static void main(String[] args) {
		int[] a = {22,33,44,55,66,77,88};
		
		int update_ele=44;
		int new_ele = 21;
		for (int i = 0; i < a.length; i++)
		{
			if(update_ele == a[i])
			{
				a[i]=new_ele;
			}
			System.out.println(a[i]);
		}
		
		
		
		
	}

}
