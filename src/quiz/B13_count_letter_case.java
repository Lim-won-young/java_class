package quiz;

public class B13_count_letter_case {
	
	
	public static void main(String[] args) {
		
		String code = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		String letter = "The early bird catches the worm. 07/23Z";
		
		char[] letterArr = letter.toCharArray();
		
		
		int[] alpa_C = new int[62];
		
		
		for (int i = 0; i < letterArr.length; i++) {
			
			for (int j = 0; j < code.length(); j++) {
				
				if (letterArr[i] == code.charAt(j)) {
					alpa_C[j] += 1;
					break;
				}
			}		
		}
		
		for (int i = 0; i < 62; i++) {
			if (alpa_C[i]>0) 
			System.out.printf("%c는 %d번 나왔습니다\n",code.charAt(i) ,alpa_C[i]);
		}
	
	
		
	}
}
