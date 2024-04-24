package AssignmentModule_3_Corejava;
//WAP to create one thread by extending Thread class in another

class  A extends Thread
{
	public void run()
	{
		for(int i=0; i<=5; i++)
		{
			System.out.println(i+": learning  java");
		}
	}
}


public class A_27ThreadByExtending {
	public static void main(String[] args) {
		
		A a = new A();
		a.start();
		
	}

}
