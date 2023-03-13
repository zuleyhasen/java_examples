import java.util.Scanner;
public class exm3 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int fýat;
		double kdv;
		System.out.println("ürün fiyatýný girin:");
		fýat = input.nextInt();
		kdv = (fýat*0.18)+fýat;
		System.out.println("kdv'li fiyatý:\t" +String.format("%.3f",kdv));
		
	}
}
