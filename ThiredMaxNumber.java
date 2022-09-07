package Arrays;

//WAP to find third maximum number from list of numbers.

public class ThiredMaxNumber {
	public static void main(String arg[])
	{
		int a[]= {1,2,7,4,9,22};
		int temp;
		int size=a.length;
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)	
			{
				if(a[i]>a[j])
				{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
				}
			}
		
		}
		System.out.println("Thired highest number is :" +a[size-3]);
	}

}
