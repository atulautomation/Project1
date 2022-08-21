package preexam;

public class SaddlePoint {

	public static void main(String[] args)
	{
		int[][] a= {{6,3,1},
				{9,7,8},
				{2,4,5}};
		Code(a);
	}

	private static void Code(int[][] a) 
	{
		int cnt=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				int chotacnt=0;
				for(int k=0;k<a[i].length;k++)
				{
					if(a[i][k]<a[i][j])
					{
						chotacnt++;
						break;
					}
				}
				int largecnt=0;
				for(int k=0;k<a[i].length;k++)
				{
					if(a[k][j]>a[i][j])
					{
						largecnt++;
						break;
					}
				}
				if(chotacnt==0 && largecnt==0)
				{
					System.out.println("Saddle point is :"+a[i][j]+" ");
					cnt++;
				}
			}
		}
		if(cnt==0)
			System.out.println("No saddle point");
		
	}

}
