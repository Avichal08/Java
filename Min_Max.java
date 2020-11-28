import java.util.Scanner;
public class Min_Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of elements in array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter " +n+ " Elements" );
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Min_Max m = new Min_Max();
		System.out.println("Min is : " + m.min(arr));
		System.out.println("Max is : " + m.max(arr));
	}
	
	public int max(int [] array) {
	      int max = 0;
	     
	      for(int i=0; i<array.length; i++ ) {
	         if(array[i]>max) {
	            max = array[i];
	         }
	      }
	      return max;
	   }
	   public int min(int [] array) {
	      int min = array[0];
	     
	      for(int i=0; i<array.length; i++ ) {
	         if(array[i]<min) {
	            min = array[i];
	         }
	      }
	      return min;

	   }
	   
	   
	   
	   
}
