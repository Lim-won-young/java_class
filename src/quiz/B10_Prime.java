package quiz;

import java.util.Scanner;

public class B10_Prime {
	
	public static void main(String[] args) {
		
		// 사용자로부터 숫자를 입력받으면
		// 1부터 입력한 숫자 사이에 존재하는 소수를 모두 출력해보세요
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하시오 > ");
		int num = sc.nextInt();
		if (num <= 1) {
			System.out.println("1보다 큰 수를 입력해주세요");
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
