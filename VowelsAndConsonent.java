package Arrays;

public class VowelsAndConsonent {

	public static void main(String[] args) {
		char a[]= {'s','d','y','f','k','i','o'};
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]=='a' || a[i]=='e' || a[i]=='i' || a[i]=='o' || a[i]=='u' )
			{
				System.out.println(a[i]);
			}
		}
		
	}
}
