package myobj.machine;

public class Microwave implements Electornics {

	private int battery;
	private int consumption;
	private int watt;
	private String name;
	
	
	public Microwave() {
		this.battery = 0;
		this.name = "전자레인지";
		this.consumption = 240;
		this.watt = 700;
	}
	
	
	public void check_watt() {
		System.out.printf("현재 전자레인지의 출력 : %dW",this.watt);
	}
	
	
	@Override
	public void charge(int charge) {
		this.battery += charge;
		
	}
	
	@Override
	public void checkBattery() {
		System.out.printf("배터리 잔량 : %d\n",this.battery);
		
	}
	
	@Override
	public void checkConsumption() {
		System.out.printf("전력 소비량 : %d\n",this.consumption);
		if (this.consumption >= st_consumption) {
			System.err.println("전력 소비량이 기준치 이상입니다");
		}
	}
	
	
	@Override
	public void action() {
		if (this.battery - this.consumption >= 0) {
			this.battery = this.battery - this.consumption;
			System.out.printf("%s를 작동합니다. 들어간 물체의 온도가 올라갑니다\n 배터리 잔량 : %d\n",this.name, this.battery);
		}
		
		else 
			System.out.println("전력이 부족합니다 충전해주세요\n");
		
	}
}
