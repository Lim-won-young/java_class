package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import myobj.fruit.Mango;

public class D04_MaxMango {
	public static void main(String[] args) {
		
		List<Mango> mangobox = new ArrayList<>(100);
		
		for(int i = 0; i < 100; i++) {
			mangobox.add(new Mango());
		}
		
		
		
		Collections.sort(mangobox);
		// System.out.println(mangobox);
		System.out.println(mangobox);
		
		System.out.println("���� Į�θ��� ���� ���� �� �絵�� ���� ������ Status : " + Collections.max(mangobox));
		
		
		
		
		
	}
}
