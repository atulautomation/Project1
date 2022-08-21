package preexam;

import java.util.ArrayList;
import java.util.List;

public class Strictily
{
	public static void main(String[] args)
	{
		int[] a= {5,1,3,6,8,2,9,3,10};
		Code(a);
	}
	private static void Code(int[] a) 
	{
		List<Integer> inc=new ArrayList<>();
		List<Integer> dec=new ArrayList<>();
		if(a[0]>a[1])
		{
			dec.add(a[0]);
			inc.add(a[1]);
		}
		else
		{
			dec.add(a[1]);
			inc.add(a[0]);
		}
		for(int i=2;i<a.length;i++)
		{
			if(a[i]>inc.get(inc.size()-1))
			{
				inc.add(a[i]);
			}
			else if(a[i]<dec.get(dec.size()-1))
			{
				dec.add(a[i]);
			}
			else
			{
				System.out.println(-1);
				System.exit(0);
			}	
		}
		for(int in:inc)
			System.out.print(in);
		for(int de:dec)
			System.out.print(de);
	}
}
