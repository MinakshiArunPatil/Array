package Arrays;
import java.util.ArrayList; 
//WAP to create a dynamic array. Dynamic Array means when
	//user want to input the number more than size of array it
	//will increase the size of array without throwing exception.


public class DynamicArray {
	
			public static void main(String arg[])

			{
				ArrayList<Integer> List = new ArrayList<Integer>();
				List.add(1);
				List.add(2);
				List.add(3);
				List.add(4);
				List.add(5);
				for(int i = 0, size = List.size(); i < size; i ++)
				{
				   System.out.println("At index " + i + " our no is: " + List.get(i));
				}
			}}
				 /*int a[]=new int [5];
			     a[0]=10;
			     a[1]=20;
			     a[2]=30;
			     a[3]=40;
			     a[4]=50;
			     
			     System.out.println("Elements of Array are ");
			     
			     for(int i=0;i<a.length;i++)
			     {
			         System.out.print(a[i]+" ");
			     }
			   
			}
}

/*
If you are wondering why I am using .size() instead of .length is because arrayLists do not have a .length method, and .size does the same thing for it.

**if you are wondering why I have int = 0, size = sList.size(); it is because this way you enhance your code performance as your loop is of O(n) complexity, however if we were to do i < sList.size() it would be O(n) * sList.size() as you would constantly be calling sList.size() per iteration of your loop.
*/