import java.util.Scanner;

public class Attendance {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ð��� ���� 24�� ǥ����� ���� ���� 4�ڸ��� �Է����ּ���");
		int at_time = sc.nextInt();
		
		if (at_time > 2400 || at_time < 0 || at_time%100>= 60)
			System.err.println("�߸��� �ð� �Է��Դϴ�");
		
		else if (at_time > 1500)
			System.out.println("�Ἦ");
		
		else if (at_time > 910)
			System.out.println("����");
		else 
			System.out.println("����");
		
		
		
		
	}

}
