package quiz;

public class B11_whileQuiz {

	
		public static void main(String[] args) {
			
			
			// while ���� �̿��Ͽ�
			// 1. 1���� 100������ 3�� ����� ������ ���غ��ÿ�
			
			
			int start = 1;
			int result = 0;
			
			while(start <= 100) {
				
				if (start%3==0) {
					result += start;
				}
				start++;
			}
			System.out.println(result);
			
			
			
			// 2. 200���� 1���� ���
			
			start = 200;
			
			while(start >= 1) {
				System.out.println(start);
				start--;
			}
			
			// 3. 1~200 ������ ���� �� 2�� ����� �ƴϰ� 3�� ����� �ƴ� ���ڵ��� ������ ���Ͻÿ�
			
			start = 200;
			result = 0;
			
			while(start >= 1) {
				
				if (!(start%2==0 || start%3==0)) {
					result += start;
				}
				start--;
			}
			
			System.out.println(result);
			
			
			
			
		}
}


