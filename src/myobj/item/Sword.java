package myobj.item;

import java.util.Random;

public class Sword {
	
	public int offense_power_base;
	public int star; 				// ��ȭ ��ġ
	public int reinforce_suc; 		// ��ȭ ���� Ȯ��
	public int starF;				// ��ȭ �� ��� ���ݷ�
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
	
	// �� �ν��Ͻ� �޼��带 ���� ���� static�� ���� �Ѵ�
	//	static�޼���� �ν��Ͻ� ������ Ȱ���� �� ����
	
	public int reinforce() {
		Random ran = new Random();
		int suc = ran.nextInt(100)+1;
		int reinforce_suc_s = this.reinforce_suc - (star*7);
		boolean vic = false;
		String result = "";
		
		
		System.out.printf("���� ��ȭ Ȯ�� : %d%%\n",reinforce_suc_s);
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
			System.out.println("�ִ� ��ȭ ��ġ�� �����Ͽ����ϴ�.");
			System.out.println("��ȭ�� ������ Ƚ�� : "+ cnt);
			return cnt;
		}
		
		
		result = vic ? "��ȭ ����!!" :"��ȭ ����!!";
		
		System.out.println(result);
		System.out.println("������ ���� ��ȭ ��ġ : " +star);
		
		
		return cnt;
	}
	
	public void attack(int enemy_HP) {
		
		
		System.out.printf("ü���� %d�� ���� �߰��Ͽ����ϴ�.\n",enemy_HP);
		
		if (enemy_HP - offense_power_rein > 0) {
			System.out.println("���� ���� ü�� : "+ (enemy_HP - offense_power_rein));
			System.out.println("���� �ݰݿ� ����ϼ̽��ϴ�");
		}
		else 
			System.out.println("���� ����Ͽ����ϴ�.");
		
	}
	
	
	public int damage() {
		return offense_power_rein;
	}

}


