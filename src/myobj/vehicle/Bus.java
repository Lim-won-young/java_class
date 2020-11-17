package myobj.vehicle;

public class Bus {
	public int year;
	public int passenger;
	public String fuel;
	
	public Bus() {
		this.year = 2020;
		this.passenger = 10;
		this.fuel = "휘발유";
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
		System.out.println("승객이 "+this.passenger+"명 있습니다.");
		System.out.println(this.passenger*1330 + "원 벌었습니다");
	}
	
	public void quiT() {
		this.passenger--;
		System.out.println(this.passenger + "명 남았습니다");
	}
	

}
