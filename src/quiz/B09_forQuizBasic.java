package quiz;

import java.util.Scanner;

public class B09_forQuizBasic {
	
	public static void main(String[] args) {
		int sum = 0;
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("숫자를 입력하시오 > ");
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
		
		System.out.printf("입력받은 숫자부터 10까지의 합 : %d\n", sum);
		
		
		
		System.out.print("숫자를 입력하시오 > ");
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
		
		System.out.println("3의 배수의 개수 "+ count );
		
		
	}
	
}











