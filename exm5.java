
public class exm5{
	public static void main(String args[]){
		int a = 5;
		int b = 10;
		int c = 45;
		
		if((a>b)&&(a>c)) {
			System.out.println("a en b�y�k say�");
		    if((b>c)){
				System.out.println("\nb ortanca say�\nc en k���k say�");
			}else {
				System.out.println("\nc ortanca say�\nb en k���k say�");
			}
		}else if((c>a)&&(c>b)){
			System.out.println("c en b�y�k say�");
			if((a>b)){
				System.out.println("a ortanca say�\nb en k���k say�");
			}else {
				System.out.println("b ortanca say�\na en k���k say�");
			}
			
		}else {
			System.out.println("b en b�y�k say�d�r");
			if((a>c)){
				System.out.println("\na ortanca say�\nc en k���k say�");
			}else {
				System.out.println("\nc ortanca say�\na en k���k say�");
			}
		}
		
		
	}
}
