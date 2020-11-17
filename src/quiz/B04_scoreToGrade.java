package quiz;

import java.util.Scanner;

public class B04_scoreToGrade {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하시오 > ");
		int score = sc.nextInt();
		
		if (score >= 101 || score<0) {
			System.out.println("잘못된 입력입니다. 프로그램을 종료합니다.");
			return;
			
			// return; -> main()을 끝낸다
			// System.exit(0); // 프로그램을 종료한다
		}
		
		char grade = 'F';
		
			
		if (score >= 90)
			grade = 'A';
		else if (score >= 80)
			grade = 'B';
		else if (score >= 70)
			grade = 'C';
		else if (score >= 60)
			grade = 'D';
		
		System.out.println("당신의 등급은 : " + grade );
		
		
	}

}
