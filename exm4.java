import java.util.Scanner;

public class exm4 {

	public static void main (String args[]) {
		
		Scanner input = new Scanner(System.in);
		int r;
		double c, a;
	
		System.out.println("lütfen dairenin yarýçapýný girin:");
		r = input.nextInt();
		c = 2*(Math.PI)*r;
		a = (Math.PI)*(r*r);
		System.out.println("dairenin çevresi:"+String.format("%.3f",c));
		System.out.println("dairenin alaný:"+String.format("%.3f",a));
	}

	


}
