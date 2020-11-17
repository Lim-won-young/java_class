package quiz;

import java.util.Scanner;

public class B01_GuessAge {

	
	public static void main(String[] args) {
		

		int repeat = 0;
	
		while(repeat != 999) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("원하는 항목을 선택하시오");
			System.out.print("1. 나이 계산/ 2. 온도 변환 / 3. 달러 환전 > ");
			
			int num = sc.nextInt();
			
			
			switch(num) {
			case 1:
				System.out.print("올해의 년도를 입력하시오 > ");
				int thisYear = sc.nextInt();
			
				System.out.print("태어난 년도를 입력하시오 > ");
				int bornYear = sc.nextInt();
				
				System.out.printf("당신의 나이는 %d살 입니다\n", thisYear-bornYear+1);
				repeat = 999;
				break;
			case 2:
				System.out.print("온도를 입력하시오(℃) > ");
				int celcius = sc.nextInt();
				
				System.out.printf("화씨로 변환합니다 -> %d℉\n", (celcius * 9/5) + 32);
				repeat = 999;
				break;
			case 3: 
				System.out.print("환전할 금액을 입력하시오/단위(원) > ");
				int won = sc.nextInt();
				double exchange = 1140.24;
				System.out.printf("%.2f$가 지급됩니다", (won*0.9825)/exchange);
				repeat = 999;
				break;
				
			default :
				System.out.println("잘못된 입력입니다. 다시 입력해주세요\n");
				
				
			
			}
		}
		

	}
}




