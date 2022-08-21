package DeadLock;

public class Class1
{
	public synchronized void c1m1(Class2 class2)
	{
		System.out.println("In c1m1");
		class2.c2m2();
	}
	public synchronized void c1m2() 
	{
	System.out.println("In c1m2");	
	}
}
