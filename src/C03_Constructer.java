import myobj.item.Sword;

public class C03_Constructer {
	
	
	// # Ŭ������ ������ (Constructor)
	
	// ������ Scanner�� Ÿ�� ������ Scanner�� ������
	// Scanner sc = new Scanner(System.in);

	
	// - Ŭ������ �̸��� �Ȱ��� �̸��� �Լ� (new�� �Բ� ����Ѵ�)
	// - new�� �Բ� �����ڸ� ȣ���ϸ� Ŭ������ ���ǵȴ�� �ν��Ͻ��� �����Ѵ�
	// - �����ڰ� ��� ����� �Ŀ��� ������ �ν��Ͻ��� �ּҰ� ��ȯ�ȴ�
	// - �����ڸ� ���� �������� ������ �ƹ��͵� ���ǵ��� ���� �⺻�����ڰ� �ڵ����� �����ȴ�
	
	
	// �� �⺻ ������ - �Ű������� ���� ������	
	
	public static void main(String[] args) {
//		Orange o1 = new Orange();
//		Orange o2 = new Orange(5,5,"green");
//		
//		System.out.println(o1.color);
//		System.out.println(o1.size);
//		System.out.println(o1.sweet);
//		
//		
//		System.out.println(o2.color);
//		System.out.println(o2.size);
//		System.out.println(o2.sweet);
//		
//		Strawberry s1 = new Strawberry();
//		
//		Grape g1 = new Grape(30);
//		Grape g2 = new Grape();
//		
//		for (int i = 0; i < 31; i++)
//			g1.eat();
		
//		
//	
//		
//		Bus bus1 = new Bus(33);
//		System.out.println(bus1.year);
//		System.out.println(bus1.fuel);
//		bus1.quiT();
//		
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		
//		Bus bus2 = new Bus(11,"����");
//		System.out.println(bus2.year);
//		System.out.println(bus2.fuel);
//		bus2.quiT();
		
		Sword s1 = new Sword();
		Sword s2 = new Sword(5);
		
		
		System.out.println("�� 1�� �ʱ� ���ݷ� : " + s1.offense_power_rein);
		
		s1.attack(30);
		
	
		while (s1.star != 10)
			s1.reinforce();
		
		
		System.out.println();
		System.out.println("��ȭ �� �� 1�� ���ݷ� : " + s1.offense_power_rein);
		s1.attack(30);
		
	}
	
}


// ���ǵ� �����ڰ� �ִٸ� �⺻ �����ڰ� �ڵ����� �������� �ʴ´�
class Grape {
	int podo;
	int skin;
	
	public Grape(int podo) {
		this.podo = podo;
		this.skin = 0;
	}
	
	// �ڵ����� �������� �����Ƿ�, �⺻ �����ڸ� ����ϰ� �ʹٸ� ���� �����ؾ� �Ѵ�.
	public Grape() {
		this(20);
		
		// �����ڿ��� this()�� ���� �ٸ� �����ڸ� ȣ���� �� �ִ�
		// �ٸ� �����ڴ� �ݵ�� ������ �� ���ٿ��� ȣ���ؾ� �Ѵ�
	}
	
	public void eat() {
		if (podo == 0) {
			System.err.println("�� ������ �� �Ծ����ϴ�.\n");
			return;
		}
		podo--;
		skin++;
		System.out.printf("���� ���� ������ %d��, ���ش� %d�� �Դϴ�\n", podo, skin);
	}
}


// �����ڸ� �������� ���ٸ� ������ �⺻ �����ڰ� �����Ѵ�
class Strawberry {
	int seed;
	String color;
	
	
}



class Orange {
	
	int sweet;
	int size;
	String color;
	
	// # �������� Ư¡
	// - ���� Ÿ���� ���� Ŭ������� ���� �̸��� ������
	// - �ν��Ͻ� �����ÿ� ���� ���� ȣ��ȴ�
	// - �ַ� �ν��Ͻ� ���� ���� �ʱ�ȭ�ϴ� �뵵�� ����Ѵ�
	public Orange() {
		// ���ÿ��� Ŭ���� ���ο��� this�� �����ص� �ʵ忡 ������ �� �ִ�
		sweet = 10;
		size = 5;
		color = "orange";
	}
	
	// # �����ڵ� �Լ�ó�� �����ε��� �����ϴ�
	// - �ϳ��� Ŭ������ �پ��� ������ �����ڸ� ������ ���� �� �ִ�
	
	public Orange(int sweet, int size, String color) {
		// # this
		//	- Ŭ���� ���ο��� ���� �ν��Ͻ��� ������ �� ����ϴ� Ű����
		
		
		// �ʵ尪�� ������������ ��ġ�� ��� this�� ���� ����� �������� ��Ȯ�� ������ �� �ִ�.
		
		// �� this�� ���� ���� �ν��Ͻ� ������ �ȴ�
		this.sweet = sweet;
		this.size = size;
		this.color = color;
		
	}
}



























