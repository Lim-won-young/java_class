package quiz;

import java.util.Scanner;

public class B11_reverse_number {
	
	public static void main(String[] args) {
		
		
		
		// ����ڷκ��� ������ �ϳ� �Է¹ް� 
		// �� ������ �����ڸ����� ���ڸ��� ����غ��ÿ�
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��Ͻÿ� > ");
		int num = sc.nextInt();
		if (num <= 0) {
			System.out.println("0���� ū ���� �Է����ּ���");
			return;
		}
		
		
		int line = (int)Math.log10(num) ;

		int cut = 10;
		int resultN = 0;
		
		while(num != 0) {
			resultN += (num % cut) * Math.pow(10, line);
			line--;
			num = num / cut;
		}
		
		System.out.println(resultN);
		
		
		

		
		
		
		
		
		
		
		
		
		
		
	}

}
