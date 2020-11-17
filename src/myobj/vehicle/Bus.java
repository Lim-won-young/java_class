package myobj.vehicle;

public class Bus {
	public int year;
	public int passenger;
	public String fuel;
	
	public Bus() {
		this.year = 2020;
		this.passenger = 10;
		this.fuel = "�ֹ���";
	}
	
	public Bus(int passenger) {
		this();
		this.passenger = passenger;
	}
	
	public Bus(int passenger, String fuel) {
		this(passenger);
		this.fuel = fuel;
		
	}
	
	
	public void revenue () {
		System.out.println("�°��� "+this.passenger+"�� �ֽ��ϴ�.");
		System.out.println(this.passenger*1330 + "�� �������ϴ�");
	}
	
	public void quiT() {
		this.passenger--;
		System.out.println(this.passenger + "�� ���ҽ��ϴ�");
	}
	

}
