//import java.util.Iterator;

public class Pattern
{

	public static void main(String[] args) 
	{
		int ir=5;
		int jr=5;
		for(int i=0;i<ir;i++)
		{
			for(int j=0;j<jr;j++)
			{
				if(j-i<=0)
				System.out.println("*");
				else
				System.out.println(" ");
			}
			System.out.println();
		}
		

	}

}
