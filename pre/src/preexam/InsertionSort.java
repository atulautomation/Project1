package preexam;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,5,6,3,8,6,9,2,0};
		print(a);
	}

	private static void print(int[] a) 
	{
		for(int i=0;i<a.length;i++)
		{
			int temp=a[i];
			int j=i-1;
			while(j>=0 && temp<=a[j])
			{
				a[j+1]=a[j];
				j=j-1;
			}
			a[j+1]=temp;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}

}
