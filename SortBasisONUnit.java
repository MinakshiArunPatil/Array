package Arrays;

public class SortBasisONUnit {
	 public static void main(String[] args) {
	      int[] a = {10,2,3,41,12,13,19,81,9};
	      for(int i=0; i<a.length; i++) {
	          for(int j=1+i; j<a.length; j++) {
	              if(a[i]%10>a[j]%10) {
	                  int temp = a[i];
	                  a[i]= a[j];
	                  a[j]=temp;
	              }
	          }
	      }
	     for(int k=0;k<a.length;k++) {
	          System.out.println(a[k]);
	      }
	}
}
