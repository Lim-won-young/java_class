package quiz;

import java.util.Random;
import java.util.Scanner;

public class B13_31game {
	
	public static void main(String[] args) {
		
		// 1. 컴퓨터와 사람이 번갈아가면서 숫자를 선택한다 (1,2,3)
		// 2. 컴퓨터는 랜덤으로 숫자를 선택한다
		// 3. 마지막에 31을 부르는 사람 혹은 컴퓨터가 패배한다
		
		
		int count = 0;
		String name;
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		// 처음 숫자를 부르는 객체를 랜덤으로 지정
		// 임의로 true일때 사람(플레이어), flase일때 컴퓨터라고 가정
		boolean player = ran.nextBoolean();
		name = player ? "유저" : "컴퓨터";
		System.out.printf("선공은 %s 입니다.\n",name);
		
		while(true) {
			int num;
			if (player == false) {
				num = ran.nextInt(3)+1;
				System.out.println("컴퓨터 > " + num);
			}
			else {
				System.out.print("사람 > ");
				num = sc.nextInt();
				if (num > 3 || num < 1) {
					System.out.println("잘못된 입력");
					continue;
				}
			}
			count += num;
			if (count >= 31)
				break;
			System.out.println("현재 숫자 : "+count);
			player = !(player);
		}
		
		name = player ? "유저" : "컴퓨터";
		System.out.printf("%s이(가) %d를 불렀습니다. %s 패배",name,count,name);
		
	
		
		
		
		
		
		
		
		
		
	}
}
