package preexam;

public class Kapekar {

	public static void main(String[] args)
	{
		int start=1;
		int end=100;
		Code(start,end);

	}

	private static void Code(int start, int end)
	{
		for(int i=start;i<=end;i++)
		{
			int num=i;
			int sq=num*num;
			int num2=sq;
			int noofdays=0;
			while(num2>0)
			{
				noofdays++;
				num2=num2/10;
			}
			if(noofdays%2!=0)
			{
				noofdays=noofdays+1;
			}
			noofdays=noofdays/2;
			int den=(int)Math.pow(10, noofdays);
			int part1=sq%den;
			int part2=sq/den;
			if(part1+part2==num)
			{	
				System.out.println(num);
			} 
			
		}
	}

}
