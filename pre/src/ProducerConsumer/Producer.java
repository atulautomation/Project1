package ProducerConsumer;

public class Producer extends Thread
{
	Shop shop;

	public Producer(Shop shop)
	{
		super();
		this.shop = shop;
	}
	public void run()
	{
		while(true)
		{
			shop.Producer();
			System.out.println(shop.sugar);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}

