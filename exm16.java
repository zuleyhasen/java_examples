

public class exm16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ages = new int[] {1, 2, 5, 9, 77};
		
		for(int i = 0; i < ages.length; i++) {
			System.out.println(ages[i]);
		}
		System.out.println("***************");
		
		
		//for each döngüsü
		for(int j : ages) {
			System.out.println(j);
		}
		
		
	}

}
