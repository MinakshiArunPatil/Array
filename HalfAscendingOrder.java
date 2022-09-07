package Arrays;
//Suppose that you are having an array of size N. now your task is to sort the half array that is from 0 to N/2 in ascending order and N/2+1 to N in descending order.

public class HalfAscendingOrder {
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,5,9,6,4};
		int n=a.length;
		for(int i=0;i<=n/2;i++)
		{
			for(int j=i+1;j<n/2;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
					
			}System.out.println("Ascending order:" +a[i]+ " ");
		}

		for(int i=n/2+1;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
					
			}System.out.println("Dscending order:" +a[i]+ " ");
		}
	}

}
