package Arrays;

public class SmallestString {
	public static void main(String[] args) {
		String [] a = {"java", "reactjs", "angular", "python","C"};
		String temp="";
		System.out.println("String series smallest to longest : ");
        for(int i=0;i<a.length;i++)
        {
        	for(int j=i+1;j<a.length;j++)
        	{
        	if(a[i].length()>a[j].length())
        	{
        		temp=a[i];
        		a[i]=a[j];
        		a[j]=temp;
        	}
        	
        	}
        	System.out.println(a[i]);
        }
	}
	
}
