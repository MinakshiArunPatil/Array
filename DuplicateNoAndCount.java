package Arrays;
//WAP to find duplicate numbers and there counting from list of numbers.

public class DuplicateNoAndCount {
	
	
	public static void main(String args[])
	{
		int a[]= {1,5,3,4,2,8,6,5,4,9,1,7};
		int count=0;
		
		for(int i=0;i<a.length;i++)
		{
			
			
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					System.out.println("Duplicate numbers:"+a[j]);
					
				}
			}
		}
		System.out.println("Duplicate count numbers:"+count);
	}

}
