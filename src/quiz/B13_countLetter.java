package quiz;

public class B13_countLetter {
	public static void main(String[] args) {
		
		// 사용자로부터 문장을 하나 입력받았다 치고
		// 해당 문장에 어떤 알파벳이 몇번 등장했는지 세어서 출력
		
		String letter = "hello, where are you from?";
		
		char[] letterArr = letter.toUpperCase().toCharArray();
		
		int[] alpa_C = new int[26];
	
		
		for (int i = 0; i < letterArr.length; i++) {
			
			if (letterArr[i] >= 'A' && letterArr[i] <= 'Z') {
				alpa_C[letterArr[i] - 'A'] += 1;
			}	
		}
		
		for (int i = 0; i < 26; i++) {
			System.out.println((char)('A'+i) + ":"+ alpa_C[i]);
		}
		
		
		
		
	}
}

