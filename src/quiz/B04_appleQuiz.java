package quiz;

import java.util.Scanner;

public class B04_appleQuiz {

	
	public static void main(String[] args) {
		
		// 사과를 10개씩 담을 수 있는 바구니가 있다
		// 사용자가 사과의 개수를 입력하면 필요한 바구니의 개수를 출력
		

		Scanner sc = new Scanner(System.in);
		
		System.out.print("사과의 개수를 입력하시오 > ");
		int apple = sc.nextInt();
		int basket = 0;
		
		if (apple <= 0) 		
			basket = 0;
		
		else if (apple % 10 == 0)
			basket = apple / 10;
		
		else 
			basket = (apple /10) + 1;
	
		
		System.out.println("필요한 바구니의 개수 : "+basket +"개");
		
		
	}
}
