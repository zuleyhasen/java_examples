import java.util.Scanner;

public class exm6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String a;
		double b, c;
		
		System.out.println("yapmak istedi�iniz i�lemi s�yleyiniz:");
		a = input.nextLine();
		System.out.println("ilk say�y� girin:");
		b =input.nextDouble();
		System.out.println("ikinci say�y� girin:");
		c =input.nextDouble();
		
		switch(a) {
		case "toplama":
			System.out.println(b+c);
			break;
		case "��kartma":
			System.out.println(b-c);
			break;
		case "�arpma":
			System.out.println(b*c);
			break;
		case "b�lme":
			System.out.println(b/c);
			break;
		}
	}

}
