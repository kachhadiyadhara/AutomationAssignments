package AssignmentModule_3_Corejava;

//WAP to create one thread by implementing Runnable interface in
//Class.

class Th1 implements Runnable
{
	public void run()
	{
		 for(int i =0; i<15; i++)
			 System.out.println(i);
	}
}
public class A_26ThredByImplmenting {
public static void main(String[] args) {
	
	Th1 t1 = new Th1();
	Thread t = new Thread(t1);
	t.start();
			

}
} 
