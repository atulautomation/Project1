package ProducerConsumer;

public class Consumer extends Thread
{
	Shop shop;

	public Consumer(Shop shop) {
		super();
		this.shop = shop;
	}
	public void run()
	{
		while(true)
		{
			shop.Consumer();
			System.out.println(shop.sugar);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	
	}
}	
