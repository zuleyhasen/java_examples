import java.util.Scanner;

public class exm2 {
	
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("vize notýnuzu girin :");
		float v = input.nextFloat();
		System.out.println("final notunuzu girin.");
		float f = input.nextFloat();
		float ort = (v*30/100)+(f*70/100);
		System.out.println("vize notunuz:"+v);
		System.out.println("final notunuz"+f);
		
		float but =((50-(v*30/100))*100/70);
		System.out.println("ortalamanýz:"+ort);
		String sonuc = (ort >= 50)? "geçtiniz!" : "kaldýnýz! ";
		System.out.println(sonuc);
		if (ort <= 50) {
		System.out.println("bütten almanýz gereken not:" + String.format("%.3f", but));

		}
		else {
			System.out.println("congrats!");;
		}
	}
}
