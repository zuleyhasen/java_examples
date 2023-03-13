import java.util.Scanner;
public class exp13 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("enter n:");
		int n = input.nextInt();
		System.out.println("fibonnaci number:"+ fib(n));
		
	}
	static int fib(int n) {
		if (n==1 || n==2)
			return 1;
		return fib(n-1)+fib(n-2);
		
	}
	

}
	