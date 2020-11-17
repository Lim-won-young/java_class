package quiz;

import java.util.Scanner;

public class B11_count_369_clap {
	public static void main(String[] args) {
		
		// 사용자로부터 정수 하나를 입력 받고
		// 해당 숫자까지 369게임이 진행된다면 박수를 총 몇번 쳐야 하는지? 
		
		// # 프로그램 실행시간 측정
		long start_time = System.currentTimeMillis();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하시오 > ");
		int num = sc.nextInt();
		if (num <= 0) {
			System.out.println("0보다 큰 수를 입력해주세요");
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
		
		System.out.println("걸린 시간 : " + (end_time - start_time));
		
		
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



