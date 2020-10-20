import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array  ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter Elements  ");
		for(int i =0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int temp,start=0;
		int end = n-1;
		while(start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
		}
		System.out.println("Array after reversing  ");
			for(int j = 0; j<n; j++) {
				System.out.println(arr[j]);
			}
		
	}

}
