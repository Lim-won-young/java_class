package quiz;

public class B13_countLetter {
	public static void main(String[] args) {
		
		// ����ڷκ��� ������ �ϳ� �Է¹޾Ҵ� ġ��
		// �ش� ���忡 � ���ĺ��� ��� �����ߴ��� ��� ���
		
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

