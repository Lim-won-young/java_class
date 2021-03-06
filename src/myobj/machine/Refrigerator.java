package myobj.machine;

public class Refrigerator implements Electornics{
	
	private int battery;
	private int consumption;
	private String name;
	private int temperature;
	
	
	public Refrigerator() {
		this.battery = 0;
		this.name = "냉장고";
		this.consumption = 500;
		this.temperature=-3;
	}
	
	
	public void check_temperature() {
		System.out.printf("현재 내부 온도는 : %d입니다\n",this.temperature);
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
			System.out.printf("%s를 작동합니다. 내부 온도가 내려갑니다\n 배터리 잔량 : %d\n",this.name, this.battery);
		}
		
		else 
			System.out.println("전력이 부족합니다 충전해주세요\n");
		
	}
}
















