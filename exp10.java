
public class exp10 {

	public static void main(String[] args) {
		
		double ans = power(2,3);
		System.out.println(ans);
	}		
		
	static double power(int num1, int num2) {
		int result = 1;
		
		for(int i=1; i<= num2;i++) {
			result *= num1;
			
		}
		return result;

	}

}