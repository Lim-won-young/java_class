package quiz;

import java.util.Scanner;

public class B09_forQuizBasic {
	
	public static void main(String[] args) {
		int sum = 0;
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("���ڸ� �Է��Ͻÿ� > ");
		int num_l = sc.nextInt();
		
		
		
		if (num_l <= 10) {
			
			for ( ; num_l <= 10; num_l++) {
				
				sum += num_l;
			}
			
		}
		
		else {
			
			for ( ; num_l >=10; num_l--) {
				
				sum += num_l;
			}
		}
		
		System.out.printf("�Է¹��� ���ں��� 10������ �� : %d\n", sum);
		
		
		
		System.out.print("���ڸ� �Է��Ͻÿ� > ");
		int user = sc.nextInt();
		
		int start = 1;
		int end = user;
		
		if (user < start) {
			int temp = start;
			start = end;
			end = temp;
			
		}
		
		for (int i = start; i <= end; i++) {
			
			if (i==0) 
				continue;
			
			else if (i % 3 == 0) {				
				System.out.println(i);
				count++;
			}
			
		}
		
		System.out.println("3�� ����� ���� "+ count );
		
		
	}
	
}











