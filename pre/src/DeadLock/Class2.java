package DeadLock;

public class Class2 
{
	public synchronized void c2m1(Class1 class1)
	{
		System.out.println("In c2m1");
		class1.c1m2();
	}
	public synchronized void c2m2()
	{
		System.out.println("In c2m2");
	}
}