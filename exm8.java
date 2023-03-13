import java.util.Scanner;
import java.util.Random;
public class exm8 {

	public static void main(String[] args) {
		//break => döngüyü durdurur
		//continue => döngüyü durdurmaz bir sonraki adıma geçer
		Scanner input = new Scanner(System.in);
		Random r = new Random();
		int sayi, n=0;
		int g = r.nextInt(10);

		do {
			System.out.println("1 ve 10 arasından aklımda tuttuğum sayıyı tahmin et");
			sayi = input.nextInt();
			n++;
			if(sayi > g) {
				System.out.println("aklımda tuttuğum sayı daha küçük:)\n");
			}else if(sayi < g) {
				System.out.println("aklımda tuttuğum sayı daha büyük:)\n");
			}else {
				System.out.println("tebrikler doğru bildin");
				System.out.println(n +". tahminde bildin aferin gerizekalı:)");
				break;
			}
		}while(sayi != g);
		
		
		
		
	}

}
