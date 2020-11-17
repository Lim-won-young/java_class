package myobj.item;

import java.util.Random;

public class Sword {
	
	public int offense_power_base;
	public int star; 				// 강화 수치
	public int reinforce_suc; 		// 강화 성공 확률
	public int starF;				// 강화 당 상승 공격력
	public int offense_power_rein ;
	public int cnt;

	
	
	public Sword() {
		this.offense_power_base = 10;
		this.star = 0;
		this.reinforce_suc = 65;
		this.starF = 100;
		this.offense_power_rein = offense_power_base + (star*starF);
		
	}
	
	public Sword(int star) {
		this();
		this.star = star;
		this.offense_power_rein = offense_power_base + (star*starF);
	}
	
	// ※ 인스턴스 메서드를 만들 때는 static을 빼야 한다
	//	static메서드는 인스턴스 변수를 활용할 수 없다
	
	public int reinforce() {
		Random ran = new Random();
		int suc = ran.nextInt(100)+1;
		int reinforce_suc_s = this.reinforce_suc - (star*7);
		boolean vic = false;
		String result = "";
		
		
		System.out.printf("현재 강화 확률 : %d%%\n",reinforce_suc_s);
		System.out.println();
		if (star < 10 && suc < reinforce_suc_s) {
			star++;
			cnt++;
			vic = true;
			offense_power_rein = offense_power_base + (star*starF);
		}
		else if (star < 10 && suc >= reinforce_suc_s) {
			cnt++;
			vic = false;
		}
		
		if (star >= 10 ) {
			System.out.println("최대 강화 수치에 도달하였습니다.");
			System.out.println("강화에 도전한 횟수 : "+ cnt);
			return cnt;
		}
		
		
		result = vic ? "강화 성공!!" :"강화 실패!!";
		
		System.out.println(result);
		System.out.println("무기의 현재 강화 수치 : " +star);
		
		
		return cnt;
	}
	
	public void attack(int enemy_HP) {
		
		
		System.out.printf("체력이 %d인 적을 발견하였습니다.\n",enemy_HP);
		
		if (enemy_HP - offense_power_rein > 0) {
			System.out.println("적의 남은 체력 : "+ (enemy_HP - offense_power_rein));
			System.out.println("적의 반격에 사망하셨습니다");
		}
		else 
			System.out.println("적이 즉사하였습니다.");
		
	}
	
	
	public int damage() {
		return offense_power_rein;
	}

}


