package myobj.machine1;

public class Cleaner implements Electornics1 {
	
	ElectricSource src;
	int power;
	
	public Cleaner() {
		this.power = 30;
	}
	
	@Override
	public void setConnect(ElectricSource src) {
		this.src = src;
		
	}

	@Override
	public String execute() {
		System.out.println("û�ұ⸦ ����߽��ϴ�.");
		src.consum(power);
		
		return "���� 10��ŭ û�ҵǾ����ϴ�.";
	}
	
}
