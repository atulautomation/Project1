package preexam;

//import java.util.Iterator;

public class Harshda
{

	public static void main(String[] args)
	{
		int[] a= {1,1,1,2,2,3,5,5,5,6,4};
		int[] b= {1,2,3};
		Code(a,b);
	}
	public static void Code(int[] a,int[] b)
	{
		for(int i=0;i<b.length;i++)
		{
			int ele=b[i];
			int cnt=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[j]==ele)
					cnt++;
				if(cnt==2)
					break;
			}
			int[] n=new int[a.length-cnt];
			
			int index=0;
			cnt=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[j]!=ele)
				{	
					n[index++]=a[j];
				}	
				else if(a[j]==ele && cnt==2)
				{	
					n[index++]=a[j];
				}	
				else
				{	
					cnt++;
				}	
			}
			a=n;
		}
		for(int j=0;j<a.length;j++)
		{
			System.out.print(a[j]+" ");
		}
	}
	
}	
		
		

