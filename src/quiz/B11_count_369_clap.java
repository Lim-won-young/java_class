package quiz;

import java.util.Scanner;

public class B11_count_369_clap {
	public static void main(String[] args) {
		
		// ����ڷκ��� ���� �ϳ��� �Է� �ް�
		// �ش� ���ڱ��� 369������ ����ȴٸ� �ڼ��� �� ��� �ľ� �ϴ���? 
		
		// # ���α׷� ����ð� ����
		long start_time = System.currentTimeMillis();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��Ͻÿ� > ");
		int num = sc.nextInt();
		if (num <= 0) {
			System.out.println("0���� ū ���� �Է����ּ���");
			return;
		}
		
		int start = 1;
		int cnt = 0;	
		
		while (start <= num) {
			int check = start;
				
			while (check != 0) {
				
				if (check%10 == 3 || check%10 == 6 || check%10==9)
					cnt++;
				
				check /= 10 ;
			}
			
			start++;
		}
		
		System.out.println(cnt);
	
		long end_time = System.currentTimeMillis();
		
		System.out.println("�ɸ� �ð� : " + (end_time - start_time));
		
		
//		while (start <= num) {
//			int check = start;
//			
//			if (check%10 == 3 || check%10 == 6 || check%10==9)
//				cnt++;
//				
//				
//			while (check/10 != 0) {
//				
//				check = check / 10 ;
//				
//				if (check%10 == 3 || check%10 == 6 || check%10==9)
//					cnt++;
//				
//			}
//			
//			start++;
//		}
//		
//		System.out.println(cnt);
//	
//		
//		
		
		
		
		
		
		
		
		
	}
}



