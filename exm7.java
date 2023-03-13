import java.util.Scanner;

public class exm7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String psw, name;
		System.out.println("Lütfen kullanýcý adýnýzý girin:");
		name = input.nextLine();
		System.out.println("Lütfen þifrenizi girin:");
		psw = input.nextLine();
		if(name.equals("züleyha")&& psw.equals("1234")){
			System.out.println("kullanýcý adý ve þifreniz doðru!");
		}else {
			System.out.println("lütfen tekrar deneyiniz!");
		}
		}

}
