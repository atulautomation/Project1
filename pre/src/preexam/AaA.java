package preexam;

public class AaA 
{

		public static void main(String[] args) 
		{
			int ir=10;
			int jr=10;
			for(int i=0;i<ir;i++)
			{
				for(int j=0;j<jr;j++)
				{
					if(j+i<=9)
					System.out.print("*");
					else
					System.out.print(" ");
				}
				System.out.println();
			}
		}
}
