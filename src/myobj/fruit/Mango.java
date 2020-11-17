package myobj.fruit;

import java.util.Comparator;
import java.util.Random;

import myobj.Student;

public class Mango implements Comparable<Mango> {
	public int calorie;
	public int sweet;
	public int id;
	
	private static int mango_id = 0 ;
	
	/** �� ��� ���� �����ϴ� ������ */
	public Mango(int calorie, int sweet, int id) {
		this.calorie = calorie;
		this.sweet = sweet;
		this.id = id;
		
	}
	
	public Mango() {
		Random ran = new Random();
		
		calorie = ran.nextInt(31)+100;
		sweet = ran.nextInt(10)+1;
		
		id = mango_id++;
	}
	
	
	@Override
	public String toString() {

		return String.format("[%06d] Į�θ�: %d / �絵: %d\n",id, calorie, sweet);
	}


	@Override
	public int compareTo(Mango next_mango) {
		int calorie_result = this.calorie - next_mango.calorie;
		
		return calorie_result == 0 ? (this.sweet - next_mango.sweet) : calorie_result;
		
	}
	
	
	@Override
	public int hashCode() {
		// �� ��ü�� �����ϰ� �����Ϸ��� ��� �ؾ��ұ��? �� �����ϴ� ��
		// (�⺻ ������ �� �ν��Ͻ��� �ּҰ��� ��ȯ)
		return id;
	}

}


