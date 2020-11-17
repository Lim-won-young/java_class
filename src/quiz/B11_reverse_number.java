package quiz;

import java.util.Scanner;

public class B11_reverse_number {
	
	public static void main(String[] args) {
		
		
		
		// 사용자로부터 정수를 하나 입력받고 
		// 그 정수를 일의자리부터 한자리씩 출력해보시오
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하시오 > ");
		int num = sc.nextInt();
		if (num <= 0) {
			System.out.println("0보다 큰 수를 입력해주세요");
			return;
		}
		
		
		int line = (int)Math.log10(num) ;

		int cut = 10;
		int resultN = 0;
		
		while(num != 0) {
			resultN += (num % cut) * Math.pow(10, line);
			line--;
			num = num / cut;
		}
		
		System.out.println(resultN);
		
		
		

		
		
		
		
		
		
		
		
		
		
		
	}

}
