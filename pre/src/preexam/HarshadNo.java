package preexam;

public class HarshadNo {

	public static void main(String[] args)
	{
		int start=100;
		int end=20;
		int i=0;
		while(i<end)
		{
			int num=start;
			int num2=num;
			int sum=0;
			while(num>0)
			{
				int k=num%10;
				sum=sum+k;
				num=num/10;
			}
			if(num2%sum==0)
			{
				System.out.println("Harshad no"+num2);
				i++;
			}
			start++;
		}
	}

}