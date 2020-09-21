import java.util.Scanner;
public class factorial {
	
	static int factorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		else {
			return n * factorial(n-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number  : ");
		num = sc.nextInt();
		int fact = factorial(num);
		System.out.println("Factorial of " + num + " is " + fact);
		
	
	}
	
	

}
