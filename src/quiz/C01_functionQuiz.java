package quiz;

public class C01_functionQuiz {
	
	
	public static boolean alpa(char ch) {
		
		return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
		
	}
	
	public static boolean triple(int num) {		
		return num%3 == 0;
	}
	
	public static String eo (int num) {
		return num%2 == 0 ? "짝수입니다" : "홀수입니다";
	}
	
	public static boolean decimal (int num) {
		if (num <= 1)
			return false;
		
		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
	
	public static int factorial (int num) {
		int fac = 1;
		
		if (num < 0)
			return 0;
		
		for (int i = num ; i>=1; i--) {
			fac *= i;
		}
			
		return fac;
	}
	
	// 재귀 함수 : 자기 자신을 부르는 함수 (별로임)
	
	public static int recursive_factorial(int num) {
		
		if (num == 1)
			return 1;
		
		return num * recursive_factorial(num - 1);
	}
	
	public static int squared(int a, int b) {
		int result = 1;
		
		for (int i = 0; i < b; i++) { 
			result *= a;
		}
		return result;
	}
	
	
	public static int recursive_squared(int a, int b) {
		
		if (b == 0)
			return 1;
		
		return a * recursive_squared(a,b-1);
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		// 1. 입력받은 문자가 알파벳인지 아닌지 판별
		System.out.println(alpa('a'));
		
		// 2. 입력받은 숫자가 3의 배수인가?
		System.out.println(triple(0));
		
		// 3. 입력받은 숫자가 짝수인가 홀수인가?
		System.out.println(eo(0));
		
		// 4. 입력받은 숫자가 소수인지 아닌지
		System.out.println(decimal(2));
		
		// 5. 입력받은 숫자의 팩토리얼
		System.out.println(factorial(0));
		
		// 6. 입력받은 두수 a의 b제곱
		System.out.println(squared(3,4));
		
		
		System.out.println(recursive_squared(3,0));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
