package myobj.machine;

public class Refrigerator implements Electornics{
	
	private int battery;
	private int consumption;
	private String name;
	private int temperature;
	
	
	public Refrigerator() {
		this.battery = 0;
		this.name = "�����";
		this.consumption = 500;
		this.temperature=-3;
	}
	
	
	public void check_temperature() {
		System.out.printf("���� ���� �µ��� : %d�Դϴ�\n",this.temperature);
	}
	
	
	
	@Override
	public void charge(int charge) {
		this.battery += charge;
		
	}
	@Override
	public void checkBattery() {
		System.out.printf("���͸� �ܷ� : %d\n",this.battery);
		
	}
	
	@Override
	public void checkConsumption() {
		System.out.printf("���� �Һ� : %d\n",this.consumption);
		if (this.consumption >= st_consumption) {
			System.err.println("���� �Һ��� ����ġ �̻��Դϴ�");
		}
	}
	
	
	
	@Override
	public void action() {
		if (this.battery - this.consumption >= 0) {
			this.battery = this.battery - this.consumption;
			System.out.printf("%s�� �۵��մϴ�. ���� �µ��� �������ϴ�\n ���͸� �ܷ� : %d\n",this.name, this.battery);
		}
		
		else 
			System.out.println("������ �����մϴ� �������ּ���\n");
		
	}
}
















