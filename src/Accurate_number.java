import java.util.Random;
import java.util.Scanner;

public class Accurate_number {
	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		int answer_c = ran.nextInt(1001);
		int answer_u;
		
		int cnt = 0;
		int min = -1;
		int max = 1001;
		
		while (true) {
			cnt++;
			
			System.out.printf("����� > ");
			answer_u = sc.nextInt();
			if (answer_u <= min || answer_u >= max) {
				System.err.println("�߸��� �Է��Դϴ�.");
				continue;
			}
			
			
			if (answer_u < answer_c) {
				System.out.println("UP!");
				min = answer_u;
			}
			else if (answer_u > answer_c) {
				System.out.println("DOWN!");
				max = answer_u;
			}
			else {
				System.out.println("����!");
				break;
			}
			
		}
		
		
		System.out.printf("���� : %d\n�õ�ȸ�� : %d",answer_c,cnt);
		
		
		
	}

}
