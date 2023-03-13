
public class exp12 {

	public static void main(String[] args) {
		int sum = 0;
		System.out.println(addUntilx(10,sum));
		
	}
	//recursive function
	static int addUntilx(int x, int sum) {
		if(x == 0) {
			return sum;
		}
		return addUntilx(x-1, sum+x);
	}
}
