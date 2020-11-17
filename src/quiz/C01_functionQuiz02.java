package quiz;

import java.util.Arrays;


public class C01_functionQuiz02 {
	
	// 1. �ּҰ��� �ִ밪�� �Ű������� ������ �� ������ ���� ���� �����ϴ� int �迭�� ��ȯ�ϴ� �Լ� (�ּҰ� �̻�, �ִ밪 �̸�)
	
	public static int[] rangeN(int max, int min) {
		
		int[] rangeN;
		int count = 0;
		
		if (max < min) {
			int temp = max;
			max = min;
			min = temp;
		}
		
		rangeN= new int[max-min];
		
		for (int i = min; i < max; i++) {
			rangeN[count++] = i;
		}
		
		return rangeN;
		
	}
	
	
	public static int[] rangeN2(int max) {
		
		int[] rangeN2;
		
		if (max<=0) {
			System.out.println("0���� ū ���� �Է����ּ���");
			System.exit(0);
		}
		
		rangeN2 = new int[max];
		
			
		for (int i = 0; i < max; i++) {
			rangeN2[i] = i;
		}
		
		return rangeN2;
	}
	
	public static String join(String[] str) {
		
		StringBuilder joinSB = new StringBuilder();

		
		for (int i = 0; i < str.length; i++) { 
			joinSB.append(str[i]);
			
			if (i != (str.length-1))
			joinSB.append("/");
		}
		
		
		return joinSB.toString();
			
		
	}
	
	public static String base_change(String num,int base_from,int base_to) {
		
		num = num.toUpperCase();
		
		char[] code = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		int digits = 1;
		int decimal = 0;
		
		if (base_from < 2 || base_from > 36 || base_to < 2 || base_to > 36) {
			System.err.println("RadixError : ��� ������ ������ 2 ~ 36�Դϴ�.");
			return null;
		}
		
		// �Է¹��� ���� 10������ ��ȯ
		for (int i = num.length() -1 ; i >= 0; i--) {
			
			if (num.charAt(i) > code[base_from-1]) {
				System.err.println("RadixError : ������ ���� ���� ���� �Է��Դϴ�.");
				return null;
			}
			for (int j = 0; j < code.length; j++) {
				
				if (num.charAt(i)==code[j]) {
					decimal += (j*digits);
					digits *= base_from;		
				}
			}
		}
		
		StringBuilder result_b = new StringBuilder();
		
		while (decimal > 0) {
			result_b.insert(0, code[decimal % base_to]);
			decimal /= base_to;
		}
		
		
		
		return result_b.toString();
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		
		// 1. �ּҰ� �ִ밪 ���� ���
		int[] check = rangeN(-7,-15);
		
		System.out.println(Arrays.toString(check));
		
		System.out.println();
		
		// 2. �ִ밪 ���� 0 ������ ��� 
		
		int[] check2 = rangeN2(15);
		
		System.out.println(Arrays.toString(check2));
		
		System.out.println();
		
		// 3. ���ڿ� �迭�� /�� �̾���̴� join�Լ�
		
		String[] fruit = {"apple","banana","orange","kiwi"};
		
		System.out.println(join(fruit));
		
		
		// 4.
		
		System.out.println(base_change("5YC1S",36,10));
		System.out.println(base_change("5YC1S",35,10));
		System.out.println(base_change("oo",27,10));

	
		
	}
}









