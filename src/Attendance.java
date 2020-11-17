import java.util.Scanner;

public class Attendance {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("시간과 분을 24시 표기법에 따라 숫자 4자리로 입력해주세요");
		int at_time = sc.nextInt();
		
		if (at_time > 2400 || at_time < 0 || at_time%100>= 60)
			System.err.println("잘못된 시간 입력입니다");
		
		else if (at_time > 1500)
			System.out.println("결석");
		
		else if (at_time > 910)
			System.out.println("지각");
		else 
			System.out.println("정상");
		
		
		
		
	}

}
