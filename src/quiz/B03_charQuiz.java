package quiz;

public class B03_charQuiz {

	
	public static void main(String[] args) {
		
		
		char a = 'Q';
		char b = '	';
		char c = '9';
		char d = 'a';
		
		
		// Hangul Jamo 		: 0x1100 - 0x11FF
		// Hangul Syllables : 0xAC00 - 0xD7A3 
		
		char e = '형';
		
		
		// 일본어				: 0x3041 - 0x309F / 0x30A0 - 0x309F
		char f = 'ひ';

		
		
		System.out.println("char형 변수 a가 'q'또는 'Q'인가? : " + (a == 'q' || a == 'Q'));
		System.out.println("char형 변수 b가 '공백'또는 'tab'이 아닌가? : " + !(b==' ' || b== '	'));
		System.out.println("char형 변수 c가 문자 '0'~ '9'사이에 있는가? : " + (c >= '0' && c <= '9'));
		System.out.println("char형 변수 d가 영문자(대/소문자 상관 X)인가? : " + ((d >= 'a' && d<= 'z') || (d >= 'A' && d <= 'Z')));
		System.out.println("char형 변수 e가 한글인가? : " + (e >= 44032 && e <= 55203 || e >= 4352 && e <= 4451));
		System.out.println("char형 변수 f가 일본어인가? : " + ((f >= 12352) && (f <= 12591)));
		
		
	}
}

