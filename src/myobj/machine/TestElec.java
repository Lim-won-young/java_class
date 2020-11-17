package myobj.machine;

public class TestElec {
	
	public static void main(String[] args) {
		
		Electornics r1 = new Refrigerator();
		Electornics m1 = new Microwave();
		
		m1.checkBattery();
		r1.checkBattery();
		
		m1.charge(1000);
		r1.charge(1000);
		
		m1.checkBattery();
		r1.checkBattery();
		
		m1.action();
		r1.action();
		
		System.out.println("=============================================");
		
		
		m1.checkConsumption();
		r1.checkConsumption();
		
		Refrigerator r2 = (Refrigerator)r1;
		Microwave m2 = (Microwave)m1;
		
		r2.check_temperature();
		m2.check_watt();
		
		
		
	}

}
