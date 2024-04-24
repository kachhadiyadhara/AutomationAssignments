package AssignmentModule_3_Corejava;

public class A_9_1Drawpattern {
	
	public static void main(String[] args) {
		
		int i,j,k; 
		
		for(i = 1; i<=4;i++)
		{
			for(j=4;j>i;j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)
				 
			{
				System.out.print(i +" ");
					
			}System.out.println();
		}
		
		
		
	}

}
