package quiz;

import java.util.Scanner;

public class B10_NextPrime {
	
	public static void main(String[] args) {
		
		// ����ڷκ��� ���ڸ� �Է¹�����
		// �Է¹��� ������ �� ũ�ų� ���� ���� �Ҽ��� ã�Ƽ� ���
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��Ͻÿ� > ");
		int num = sc.nextInt();
		if (num <= 1) {
			System.out.println("1���� ū ���� �Է����ּ���");
			return;
		}
				
		for (int i = num; ; i++) {
			boolean measure = false;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				
				if (i%j == 0) {
					measure = true;
					break;
				}
			
			}
			if (measure == false) {
			 System.out.println(i);
			 	break;
			}
		}
		
	}

}
