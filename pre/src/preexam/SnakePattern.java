package preexam;

public class SnakePattern {

	public static void main(String[] args)
	{
		int n=5;
		Code(n);
	}

	private static void Code(int n) 
	{
		int k=1;
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(k+" ");
					k--;
				}
				System.out.println();
				k=k+i+1;
			}
			else
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(k+" ");
					k++;
				}
				System.out.println();
				k=k+i;
			}
		}
	}

}