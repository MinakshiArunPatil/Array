package Arrays;

//An Array Contain different numbers you have to find how many are even, odd, perfect and prime

public class EvenOdd {
	public static void main(String arg[])
	{
		int a[]= {1,2,7,4,9,22,8,11,6,28};
		int n=a.length;
		int even=0, odd=0,p,count=0, perfectno=0;
		for(int k=1;k<n/2;k++)
		{
			int sum=0;
			if(n%k==0)
			{
				sum=sum+k;
				perfectno++;
			}
				
		}
			
		for(int i=0;i<n;i++)
		{		
		  if(a[i]%2==0)
				{
					even++;
			}else
			{
				odd++;
			}
		  p=1;
			for(int j=2;j<=i;j++)
			{
				if(a[i]%j==0)
				{
					p=0;
					break;
				}
			}if(p==1)
			{
				count++;
			}
		
		}
			
		System.out.println("Perfect no is "  +perfectno);
		System.out.println("even no is " +even);
		System.out.println("odd no is " +odd);
		System.out.println("prime no is " +count);
		}

}
