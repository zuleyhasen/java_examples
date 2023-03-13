
public class exm9 {

	public static void main(String[] args) {
		power(2,3);
		
	}		
		
	static void power(int num1, int num2) {
		int result = 1;
		
		for(int i=1; i<= num2;i++) {
			result *= num1;
			
		}
		System.out.println("cevap: "+ result);

	}

}
