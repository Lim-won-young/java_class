package quiz;

public class B02_conditionQuiz01 {
	
	public static void main(String[] args) {
		
		
		//1. int형 변수 a가 10보다 크고 20보다 작을 때 true
		
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
		
		
		System.out.println("a는 10보다 크고 20보다 작다 : " + (a > 10 && a <20)); 
		System.out.println("int형 변수 b는 짝수이다 : " + (b%2 == 0));
		System.out.println("int형 변수 c는 7의 배수이다 :" + (c%7 == 0));
		System.out.println("int형 변수 d와 e의 차이가 30이다 : " + (d-e == 30));
		
		System.out.println("hour가 0미만 24이상이 아니고 12이상이다 : " + (hour >= 12 && !(hour < 0 && hour >= 24)));
		System.out.println("year이 400으로 나누어 떨어지거나 4로 나누어떨어지고 100으로 나누어떨어지지 않는다 : " + 
		((year % 400 == 0) || (year % 4 == 0) && !(year%100==0)));
		
		System.out.println("민수가 철수보다 2살 많다 : " + (minsu_old - chulsu_old == 2));
		System.out.println("민수의 생일이 철수의 생일보다 3달 빠르다 : " + (minsu_bm-chulsu_bm == 3));
		
		System.out.println("boolean형 변수 powerOn이 false이다 : " + (powerOn == false));
		
		System.out.println("문자열 참조변수 str은 \"yes\" 이다 : " + str.equals(ans));
		
		System.out.println("삼각형 A가 직각 삼각형이다 : " + (t_a*t_a + t_b*t_b == t_c*t_c || (t_c*t_c + t_b*t_b == t_a*t_a) || (t_c*t_c + t_a*t_a == t_b*t_b) ));
		
		
		
		
	}

}






