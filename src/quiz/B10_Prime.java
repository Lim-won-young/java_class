package quiz;

import java.util.Scanner;

public class B10_Prime {
	
	public static void main(String[] args) {
		
		// ����ڷκ��� ���ڸ� �Է¹�����
		// 1���� �Է��� ���� ���̿� �����ϴ� �Ҽ��� ��� ����غ�����
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��Ͻÿ� > ");
		int num = sc.nextInt();
		if (num <= 1) {
			System.out.println("1���� ū ���� �Է����ּ���");
			return;
		}
			

		
		for (int i = 2; i <= num; i++) {
			boolean measure = false;
			for (int j = 2; j < i; j++) {
				
				if (i%j == 0) {
					measure = true;
					break;
				}
			
			}
			if (measure == false) {
			 System.out.println(i);
			}
		}
	
		
	
		
		
		
	}

}
