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
		System.out.println("청소기를 사용했습니다.");
		src.consum(power);
		
		return "방이 10만큼 청소되었습니다.";
	}
	
}
