package quiz;

import java.util.Scanner;

public class B04_scoreToGrade {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��Ͻÿ� > ");
		int score = sc.nextInt();
		
		if (score >= 101 || score<0) {
			System.out.println("�߸��� �Է��Դϴ�. ���α׷��� �����մϴ�.");
			return;
			
			// return; -> main()�� ������
			// System.exit(0); // ���α׷��� �����Ѵ�
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
		
		System.out.println("����� ����� : " + grade );
		
		
	}

}
