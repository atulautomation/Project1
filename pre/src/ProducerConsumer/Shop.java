package ProducerConsumer;

public class Shop 
{
	int sugar=10;
	public synchronized void Producer() 
	{
		sugar++;
		if(sugar>=50)
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		notify();
			
		
	}
	public synchronized void Consumer() 
	{
		sugar--;
		if(sugar<=20)
			try {
				wait();
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			notify();
		
	}
}