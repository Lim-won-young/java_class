package quiz;

public class B09_printAlphabet {
	
	
	public static void main(String[] args) {
		
		
		System.out.print("[");
		for (char i = 'A'; i <= 'Z'; i++) {
						
			System.out.print(i+" ");
			
			
		}
		
		System.out.println("]");
		
		
		
		System.out.print("[");
		for (char i = 'z'; i >= 'a'; i--) {
						
			System.out.print(i+" ");
			
			
		}
		
		System.out.println("]");
		
	}

}
