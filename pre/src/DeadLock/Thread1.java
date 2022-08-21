package DeadLock;

public class Thread1 extends Thread
{
	Class1 class1;
	Class2 class2;
	public Thread1(Class1 class1, Class2 class2)
	{
		super();
		this.class1 = class1;
		this.class2 = class2;
	}
	public void run()
	{
		class1.c1m1(class2);
	}
	
}
