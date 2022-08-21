package preexam;

public class Interliving
{

	public static void main(String[] args)
	{
		char[] a= {'a','b','c','d','e','f'};
		char[] b= {'w','x','y'};
		Code(a,b);
	}
	private static void Code(char[] a, char[] b) 
	{
		char[] c=new char[a.length+b.length];
		int index=0;
		for(int i=0;i<c.length;i++)
		{	
			if(i<a.length)
			c[index++]=a[i];
			if(i<b.length)
			c[index++]=b[i];
			
		}
		
		for(int j=0;j<c.length;j++)
		{
			System.out.print(c[j]+" ");
		}
		
	}

}
