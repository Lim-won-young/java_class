package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class D07_countFruits {
	
	
	private enum Fruit {
		APPLE, BANANA, ORANGE, KIWI
	}
	
	
	// ���� ����Ʈ�� �̿��� �� ������ �� �������� ������ Map�� �����غ�����
	
	static List<Fruit> fruits;
	
	static {
		fruits = new ArrayList<>();
		
		for (int i = 0; i < 50; i++) {
			fruits.add(Fruit.values()[(int)(Math.random() * 4)]);
		}
	}
	
	
	
	
	public static void main(String[] args) {
		Map<Fruit, Integer> fruitMap = new HashMap<>();
		
		for (Fruit fruit : Fruit.values()) {
			fruitMap.put(fruit,Collections.frequency(fruits, fruit));
		}

		System.out.println(fruitMap);
		
		
		
	}
}




