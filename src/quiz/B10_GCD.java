package quiz;

import java.util.Scanner;

public class B10_GCD {
	
	public static void main(String[] args) {
		
		// �ִ� ����� ���ϱ�
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���ڸ� �Է��Ͻÿ� > ");
		int f_N = sc.nextInt();
		if (f_N <= 0) {
			System.out.println("0���� ū ���� �Է����ּ���");
			return;
		}
		
		System.out.print("�ι�° ���ڸ� �Է��Ͻÿ� > ");
		int s_N = sc.nextInt();
		if (s_N <= 0) {
			System.out.println("0���� ū ���� �Է����ּ���");
			return;
		}
		
		
		if (s_N < f_N) {
			int temp = f_N;
			f_N = s_N;
			s_N = temp;	
		}
			
		int c_F = 1;
				
		
		for (int i = f_N; i >= 1; i--) {
			
			if (f_N%i == 0) {
				if (s_N%i == 0) {	
					c_F = i;
					break;
				}
			}
		}
		
		System.out.printf("%d�� %d�� �ִ� ����� : %d",f_N,s_N, c_F);
		
		
		int result ;
		
		for (;;) {

			int etc = s_N%f_N;
			
			if (etc == 0) {
				
				result = f_N;
				break;
			}
			else {
				
				s_N = f_N;
				f_N = etc;			
				
			}
		}
		
		System.out.printf("\n�ִ� ����� : %d" , result);
		

		
		
		
		
		
		
		
		
		
		
	}

}





