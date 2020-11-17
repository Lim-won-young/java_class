package quiz;

public class C01_functionQuiz {
	
	
	public static boolean alpa(char ch) {
		
		return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
		
	}
	
	public static boolean triple(int num) {		
		return num%3 == 0;
	}
	
	public static String eo (int num) {
		return num%2 == 0 ? "¦���Դϴ�" : "Ȧ���Դϴ�";
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
	
	// ��� �Լ� : �ڱ� �ڽ��� �θ��� �Լ� (������)
	
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
		
		// 1. �Է¹��� ���ڰ� ���ĺ����� �ƴ��� �Ǻ�
		System.out.println(alpa('a'));
		
		// 2. �Է¹��� ���ڰ� 3�� ����ΰ�?
		System.out.println(triple(0));
		
		// 3. �Է¹��� ���ڰ� ¦���ΰ� Ȧ���ΰ�?
		System.out.println(eo(0));
		
		// 4. �Է¹��� ���ڰ� �Ҽ����� �ƴ���
		System.out.println(decimal(2));
		
		// 5. �Է¹��� ������ ���丮��
		System.out.println(factorial(0));
		
		// 6. �Է¹��� �μ� a�� b����
		System.out.println(squared(3,4));
		
		
		System.out.println(recursive_squared(3,0));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
