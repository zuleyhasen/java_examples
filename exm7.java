import java.util.Scanner;

public class exm7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String psw, name;
		System.out.println("L�tfen kullan�c� ad�n�z� girin:");
		name = input.nextLine();
		System.out.println("L�tfen �ifrenizi girin:");
		psw = input.nextLine();
		if(name.equals("z�leyha")&& psw.equals("1234")){
			System.out.println("kullan�c� ad� ve �ifreniz do�ru!");
		}else {
			System.out.println("l�tfen tekrar deneyiniz!");
		}
		}

}
