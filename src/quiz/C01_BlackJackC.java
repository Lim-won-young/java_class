package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class C01_BlackJackC {
	
	// int로 처리할 경우 나누기를 통해 문양을 구별하는 로직을 작성 가능
	// 문자열로 처리할 경우 문자에 문양에 대한것을 부여할 수 있음
	
	// ※ 다른 함수에서도 변수를 사용할 수 있도록 함수 밖에 변수를 선언할 수 있다
	public static int[] deck;
	public static int[] player;
	public static int[] dealer;
	
	public static int[] game_index;
//	public static int DEALER = 0;
//	public static int PLAYER = 1;
//	public static int DECK = 2;	
	
	public static int[] shuffle() {
		int[] deck = new int[52];
		
		for (int i = 0; i < deck.length; ++i) {
			deck[i] = i;
		}
		
		for (int i = 0; i<200; ++i) {
			int ran = (int)(Math.random() * 51 + 1);
			
			int temp = deck[0];
			deck[0] = deck[ran];
			deck[ran] = temp;	
		}
		
		return deck;
	}
	
	public static void draw(int drawer) {
		
		switch (drawer) {
		case 0:
			dealer[game_index[0]++] = deck[game_index[2]++];
			break;
		case 1:
			player[game_index[1]++] = deck[game_index[2]++]; 
			break;
		}
		
		
	}
	
	public static String prettyCard(int card) {
		char[] shape = {'♡','♠','♣','◇'};
		String[] value = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		
		int s_index = card / 13;
		int v_index = card % 13;
		
		return shape[s_index] + value[v_index];
		
	}
	
	
	
	public static void print_game(int mode) {
		
		System.out.print("딜러의 카드 :\t");
		for (int i = 0; i < game_index[0]; i++) {
			if (mode == 0 && i == 0) {
				System.out.print("X ");
			}
			else {
				System.out.print(prettyCard(dealer[i]) + " ");
			}
		}
		
		if (mode == 0) {
			System.out.println();
		}
		else {
			System.out.printf("(%d)\n", check_value(0));
		}
		
		
		
		System.out.print("플레이어의 카드 :\t");
		for (int i = 0; i < game_index[1]; i++) {
			System.out.print(prettyCard(player[i]) + " ");
		}
		System.out.printf("(%d)\n",check_value(1));
		System.out.println();
		
	}
	
	
	public static int getSum(int[] values) {
		int sum = 0;
		int ace = 0;
		
		for (int i = 0; i < values.length; i++) {
			if (values[i] == 0) {
				sum += 11;
				ace += 1;
			}
			else if (values[i] >= 10) {
				sum += 10;
			}
			else {
				sum += values[i] + 1;
			}
		}
		
		
		// A가 1개 이상 존재하면서 합이 21을 넘을 때 A를 1로 변경한다
		while (sum > 21 && ace > 0) {
			sum -= 10;
			ace -= 1;
		}
		
		return sum;
	}
	
	public static int check_value(int user) {
		int[] values = new int[game_index[user]];
		
		for (int i = 0; i < values.length; i++) {
			values[i] = user == 0 ? dealer[i] % 13 : player[i] % 13;			
		}
		
		return getSum(values);
		
	}
	
	public static int check_game(int d, int p) {
		if (d > 21 && p > 21) {
			return 0;
		}
		else if (d==p) {
			return 0;
		}
		else if (p < 21 && d > 21) {
			return 1;
		}
		else if (p < 21 && p > d) {
			return 1;
		}
		else if (p == 21 && p > d) {
			return 2;
		}
		else 
			return -1;
		
	}
	
	public static int game_start() {
		
		// 무작위 순서의 덱을 하나 생성한다
		deck = shuffle();
		
		
		// 진행에 필요한 변수들을 초기화한다
		player = new int[20];
		dealer = new int[20];
		game_index = new int[3];
		
		// 만들어진 덱으로 게임을 진행한다
		//System.out.println(Arrays.toString(deck));
		
		// (1) 카드 뽑기 (딜러 = 0, 플레이어 = 1)
		draw(0); 
		draw(0);
		draw(1); 
		draw(1);
	
		//System.out.println("딜러가 뽑은 것 : " + Arrays.toString(dealer));
		//System.out.println("플레이어가 뽑은 것 : " + Arrays.toString(player));
		
		// # 플레이어의 선택
		Scanner console = new Scanner(System.in);
		int player_value = check_value(1);
		
		while ((player_value = check_value(1))<21) {
			// # 게임 정보 출력
			print_game(0);
			
			System.out.print("1.hit\t2.stand\n>> ");
			int select = console.nextInt();
			if (select == 2) {
				break;
			}
			else if (select == 1) {
				draw(1);
			}
			
			
		}
		
		// 딜러가 마저 뽑고 모든 정보를 출력한 후 결과를 리턴
		
		
		print_game(1);
		
		int dealer_value = check_value(0);
		while ((dealer_value <= 16 )&& player_value <= 21) {
			draw(0);
			dealer_value = check_value(0);
			print_game(1);
		}
		
		
		return check_game(dealer_value,player_value);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		int player_money = 10000;
		int betting = 500;
		
		
		while (player_money >= 0) {

			int game_result = game_start();
			
			StringBuilder msg = new StringBuilder("게임 결과 : ");
			
			switch (game_result) {
			case 1:
				player_money += betting;
				msg.append("승리\n");
				break;
			case 2:
				player_money += (int)(betting*2.5);
				msg.append("21로 승리\n");
				break;
			case 0:
				msg.append("무승부\n");
				break;
			default:
				player_money -= betting;
				msg.append("패배\n");
				break;
			}
			
			msg.append("현재 잔액 : " + player_money + "원\n");
			System.out.println(msg);
		}
	}
}
















