package quiz;

public class B02_conditionQuiz01 {
	
	public static void main(String[] args) {
		
		
		//1. int�� ���� a�� 10���� ũ�� 20���� ���� �� true
		
		int a = 15;
		int b = 2;
		int c = 7;
		int d = 33;
		int e = 3;
		
		int t_a = 4;
		int t_b = 5;
		int t_c = 3;
		
		int hour = 15;
		int year = 400;
		
		int minsu_old = 22;
		int minsu_bm = 9;
		
		int chulsu_old = 20;
		int chulsu_bm = 6;
		
		boolean powerOn = false;
		
		String str = "yes";
		String ans = "yes";
		
		
		System.out.println("a�� 10���� ũ�� 20���� �۴� : " + (a > 10 && a <20)); 
		System.out.println("int�� ���� b�� ¦���̴� : " + (b%2 == 0));
		System.out.println("int�� ���� c�� 7�� ����̴� :" + (c%7 == 0));
		System.out.println("int�� ���� d�� e�� ���̰� 30�̴� : " + (d-e == 30));
		
		System.out.println("hour�� 0�̸� 24�̻��� �ƴϰ� 12�̻��̴� : " + (hour >= 12 && !(hour < 0 && hour >= 24)));
		System.out.println("year�� 400���� ������ �������ų� 4�� ����������� 100���� ����������� �ʴ´� : " + 
		((year % 400 == 0) || (year % 4 == 0) && !(year%100==0)));
		
		System.out.println("�μ��� ö������ 2�� ���� : " + (minsu_old - chulsu_old == 2));
		System.out.println("�μ��� ������ ö���� ���Ϻ��� 3�� ������ : " + (minsu_bm-chulsu_bm == 3));
		
		System.out.println("boolean�� ���� powerOn�� false�̴� : " + (powerOn == false));
		
		System.out.println("���ڿ� �������� str�� \"yes\" �̴� : " + str.equals(ans));
		
		System.out.println("�ﰢ�� A�� ���� �ﰢ���̴� : " + (t_a*t_a + t_b*t_b == t_c*t_c || (t_c*t_c + t_b*t_b == t_a*t_a) || (t_c*t_c + t_a*t_a == t_b*t_b) ));
		
		
		
		
	}

}






