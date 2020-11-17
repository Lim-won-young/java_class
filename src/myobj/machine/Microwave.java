package myobj.machine;

public class Microwave implements Electornics {

	private int battery;
	private int consumption;
	private int watt;
	private String name;
	
	
	public Microwave() {
		this.battery = 0;
		this.name = "���ڷ�����";
		this.consumption = 240;
		this.watt = 700;
	}
	
	
	public void check_watt() {
		System.out.printf("���� ���ڷ������� ��� : %dW",this.watt);
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
			System.out.printf("%s�� �۵��մϴ�. �� ��ü�� �µ��� �ö󰩴ϴ�\n ���͸� �ܷ� : %d\n",this.name, this.battery);
		}
		
		else 
			System.out.println("������ �����մϴ� �������ּ���\n");
		
	}
}
