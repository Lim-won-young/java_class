package quiz;

import java.util.Random;
import java.util.Scanner;

public class C01_BlackJack {
	
	
	public static int[] selectC(int[] deck) {
		
		int selectR[] = new int[52]; 
		Random ran = new Random();
		
		
		for (int i = 0; i < 1000; i++) {
			int suf = ran.nextInt(deck.length);
			int temp = deck[0];
			deck[0] = deck[suf];
			deck[suf] = temp;
		}
		
		for (int i = 0; i < 52; i++) {
			selectR[i] = deck[i]; 
		}
		
		
		return selectR;
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		// # 블랙잭을 만들어 보세요
		int[] deck = {1,2,3,4,5,6,7,8,9,10,10,10,10,1,2,3,4,5,6,7,8,9,10,10,10,10,1,2,3,4,5,6,7,8,9,10,10,10,10,1,2,3,4,5,6,7,8,9,10,10,10,10};
		
		int cpScore = 0;
		int plScore = 0;
		int cardCount1 = 0;
		int cardCount2 = 0;
		Scanner sc = new Scanner(System.in);
		
		
		
		int[] deckR = new int [48];
		
		deckR = selectC(deck);
		
		System.out.printf("컴퓨터가 뽑은 카드 : □");
		while (true) {
			if (deckR[cardCount1]==1)
				if (cpScore+11<=21)
				deckR[cardCount1] = 11;
			
			cpScore += deckR[cardCount1];
			if (cardCount1 > 0) {
				System.out.print(" "+ deckR[cardCount1]);
				break;
			}
			cardCount1++;
		}
		System.out.println();
		
		
		cardCount2 = cardCount1;
		
		
		System.out.print("내가 뽑은 카드 :");
		while (plScore<21) {
			cardCount2++;
			if (deckR[cardCount2]==1)
				if (plScore+11<=21)
				deckR[cardCount2] = 11;
			
			plScore += deckR[cardCount2];
			System.out.print(" "+ deckR[cardCount2]);
			
			if (plScore > 21) {
				System.out.printf("\n카드 총합이 %d로 21을 초과하였습니다\n플레이어 패배!!!!",plScore);
				return;
			}
			
			if (cardCount2 > cardCount1+1 && plScore<21) {
				System.out.print("\n카드를 더 뽑으시겠습니까?(1.Y/2.N) > ");
				int choose = sc.nextInt();
				if (choose == 1)
					continue;
				else 
					break;
				
			}
		}
		
		System.out.println();
		System.out.printf("컴퓨터가 뽑은 카드 : " + deckR[0] + " " + deckR[1]);
		
		cardCount1 = cardCount2+1;
		
		while(cpScore<17) {
			if (deckR[cardCount1]==1)
				if (cpScore+11<=21)
				deckR[cardCount1] = 11;
			
			cpScore += deckR[cardCount1];
			System.out.printf(" "+deckR[cardCount1]);
			cardCount1++;
		}
		
		
		System.out.println();
		System.out.print("플레이어가 뽑은 카드 : " + deckR[2] + " " + deckR[3]);
		
		for (int i = 4; i <= cardCount2; i ++)
			System.out.print(" "+deckR[i]);
		
		System.out.println();
		
		
		
		
		if (plScore == 21 || (cpScore < plScore && plScore <= 21) || cpScore > 21)
			System.out.printf("\n컴퓨터 합 : %d\n플레이어 합 : %d \n플레이어 승리!!!",cpScore,plScore);
		else if (cpScore == plScore)
			System.out.printf("\n컴퓨터 합 : %d\n플레이어 합 : %d \n무승부!!!",cpScore,plScore);
		else
			System.out.printf("\n컴퓨터 합 : %d\n플레이어 합 : %d \n컴퓨터 승리!!!",cpScore,plScore);
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
