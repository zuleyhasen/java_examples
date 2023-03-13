
public class exm5{
	public static void main(String args[]){
		int a = 5;
		int b = 10;
		int c = 45;
		
		if((a>b)&&(a>c)) {
			System.out.println("a en büyük sayý");
		    if((b>c)){
				System.out.println("\nb ortanca sayý\nc en küçük sayý");
			}else {
				System.out.println("\nc ortanca sayý\nb en küçük sayý");
			}
		}else if((c>a)&&(c>b)){
			System.out.println("c en büyük sayý");
			if((a>b)){
				System.out.println("a ortanca sayý\nb en küçük sayý");
			}else {
				System.out.println("b ortanca sayý\na en küçük sayý");
			}
			
		}else {
			System.out.println("b en büyük sayýdýr");
			if((a>c)){
				System.out.println("\na ortanca sayý\nc en küçük sayý");
			}else {
				System.out.println("\nc ortanca sayý\na en küçük sayý");
			}
		}
		
		
	}
}
