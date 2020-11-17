package quiz;

public class B11_whileQuiz {

	
		public static void main(String[] args) {
			
			
			// while 문을 이용하여
			// 1. 1부터 100사이의 3의 배수의 총합을 구해보시오
			
			
			int start = 1;
			int result = 0;
			
			while(start <= 100) {
				
				if (start%3==0) {
					result += start;
				}
				start++;
			}
			System.out.println(result);
			
			
			
			// 2. 200부터 1까지 출력
			
			start = 200;
			
			while(start >= 1) {
				System.out.println(start);
				start--;
			}
			
			// 3. 1~200 까지의 숫자 중 2의 배수도 아니고 3의 배수도 아닌 숫자들의 총합을 구하시오
			
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


