package quiz;

public class B10_Gugudan {
	
	
	public static void main(String[] args) {
		
		
		
		for (int dan = 2; dan <=9; dan++) {
			System.out.printf("%d´Ü : ",dan);
			for (int gop =1; gop <=9; gop++) {
				System.out.printf("%d X %d = %d\t\t",dan,gop,dan*gop);
				
			}
			System.out.println();
		}
		
		
		for (int gop = 0; gop <=9; gop++) {
			System.out.println();
			for (int dan = 2; dan <=9; dan++) {
				
				if (gop == 0) {
					System.out.printf("%d´Ü\t\t", dan);
				}	
				else {	
				System.out.printf("%d X %d = %d\t",dan,gop,dan*gop);
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
