package myobj.vehicle;

public class Car_making {
	
	public int wheel;
	public int door;
	public int side_mirror;
	public String fuel;
	
	public static String[] fuel_kind;
	
	static {
		fuel_kind = new String[] {"Gasoline","Diesel","Gas"};
	}
	
	public Car_making() {
		this.wheel = 4;
		this.door = 4;
		this.side_mirror = 2;
		this.fuel = fuel_kind[0];
	}
	
	
	public static void change_fuelkind(int index_num,String fuel) {
		
		
		if (index_num >= 0 && index_num < fuel_kind.length)
			fuel_kind[index_num] = fuel;
		else 
			System.err.println("수정할 인덱스 번호가 잘못되었습니다");

	}

	

	
	public static void main(String[] args) {
		
		Car_making c1 = new Car_making();
		System.out.println(c1.fuel);
		
		change_fuelkind(0,"Electric");
		
		Car_making c2 = new Car_making();
		System.out.println(c2.fuel);
	
		
	}
}







