import java.util.Scanner;
import java.util.Random;
public class exm8 {

	public static void main(String[] args) {
		//break => d�ng�y� durdurur
		//continue => d�ng�y� durdurmaz bir sonraki ad�ma ge�er
		Scanner input = new Scanner(System.in);
		Random r = new Random();
		int sayi, n=0;
		int g = r.nextInt(10);

		do {
			System.out.println("1 ve 10 aras�ndan akl�mda tuttu�um say�y� tahmin et");
			sayi = input.nextInt();
			n++;
			if(sayi > g) {
				System.out.println("akl�mda tuttu�um say� daha k���k:)\n");
			}else if(sayi < g) {
				System.out.println("akl�mda tuttu�um say� daha b�y�k:)\n");
			}else {
				System.out.println("tebrikler do�ru bildin");
				System.out.println(n +". tahminde bildin aferin gerizekal�:)");
				break;
			}
		}while(sayi != g);
		
		
		
		
	}

}
