package quiz;

public class B03_charQuiz {

	
	public static void main(String[] args) {
		
		
		char a = 'Q';
		char b = '	';
		char c = '9';
		char d = 'a';
		
		
		// Hangul Jamo 		: 0x1100 - 0x11FF
		// Hangul Syllables : 0xAC00 - 0xD7A3 
		
		char e = '��';
		
		
		// �Ϻ���				: 0x3041 - 0x309F / 0x30A0 - 0x309F
		char f = '��';

		
		
		System.out.println("char�� ���� a�� 'q'�Ǵ� 'Q'�ΰ�? : " + (a == 'q' || a == 'Q'));
		System.out.println("char�� ���� b�� '����'�Ǵ� 'tab'�� �ƴѰ�? : " + !(b==' ' || b== '	'));
		System.out.println("char�� ���� c�� ���� '0'~ '9'���̿� �ִ°�? : " + (c >= '0' && c <= '9'));
		System.out.println("char�� ���� d�� ������(��/�ҹ��� ��� X)�ΰ�? : " + ((d >= 'a' && d<= 'z') || (d >= 'A' && d <= 'Z')));
		System.out.println("char�� ���� e�� �ѱ��ΰ�? : " + (e >= 44032 && e <= 55203 || e >= 4352 && e <= 4451));
		System.out.println("char�� ���� f�� �Ϻ����ΰ�? : " + ((f >= 12352) && (f <= 12591)));
		
		
	}
}

