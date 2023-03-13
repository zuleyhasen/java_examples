import java.util.Scanner;



public class exm18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] dizi = new int[5];
		double toplam = 0;
		Scanner input= new Scanner(System.in);
		
		for(int i = 0; i < dizi.length; i++) {
			System.out.println("Enter ur integer:");
			dizi[i] = input.nextInt();
			toplam += dizi[i];
		}
		
		System.out.print("your integers:");
		
		for(int j = 0; j < dizi.length; j++) {
			System.out.print(dizi[j]+" ");
		}
		System.out.println();
		
		System.out.println("ortalama= "+ (toplam/dizi.length));
	}

}
