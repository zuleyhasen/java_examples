import java.util.Scanner;

public class exm6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String a;
		double b, c;
		
		System.out.println("yapmak istediðiniz iþlemi söyleyiniz:");
		a = input.nextLine();
		System.out.println("ilk sayýyý girin:");
		b =input.nextDouble();
		System.out.println("ikinci sayýyý girin:");
		c =input.nextDouble();
		
		switch(a) {
		case "toplama":
			System.out.println(b+c);
			break;
		case "çýkartma":
			System.out.println(b-c);
			break;
		case "çarpma":
			System.out.println(b*c);
			break;
		case "bölme":
			System.out.println(b/c);
			break;
		}
	}

}
