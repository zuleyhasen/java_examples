import java.util.Scanner;
public class exm3 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int f�at;
		double kdv;
		System.out.println("�r�n fiyat�n� girin:");
		f�at = input.nextInt();
		kdv = (f�at*0.18)+f�at;
		System.out.println("kdv'li fiyat�:\t" +String.format("%.3f",kdv));
		
	}
}
