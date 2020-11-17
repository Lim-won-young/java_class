package quiz;

import java.util.Scanner;

public class B06_monthToSeason {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("달을 입력하시오 > ");
		int month = sc.nextInt();
		if (month <= 0 || month > 12) {
			System.out.println("달은 1에서 12월까지밖에 없습니다.");
			return;
		}
		

		
		switch (month) {
		
		case 3: case 4: case 5:
			System.out.printf("%d월은 봄입니다",month);
			break;
		case 6: case 7: case 8:
			System.out.printf("%d월은 여름입니다",month);
			break;
		case 9: case 10: case 11:
			System.out.printf("%d월은 가을입니다",month);
			break;
		
		default:
			System.out.printf("%d월은 겨울입니다",month);
			break;
			
		}
	}

}
