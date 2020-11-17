import myobj.animal.Animal;

public class C11_interface {
	
	// # �������̽� (interface)
	//	- abstract class�� ���������� ������ ��ӹ��� �� �ִ� ��
	//	- �߻��� ���� Ŭ������ ������ �ο��ϰ� ������ �̹� ��ӹ��� Ŭ������ �ִ� ��� �������̽��� ����Ѵ�
	//	- �������̽��ε� ��ĳ������ �����ϴ�
	//	- �������̽��� �޼���� �ڵ����� abstract public�޼��尡 �ȴ�
	//	- �������̽��� ������ �ڵ����� final static�� �ȴ�
	//	- �������̽��� default		 	: �⺻ ������ �ִ� �޼��带 �����Ѵ�
	//	- �������̽��� static method	: ��� �������̽����� �������� ����ϴ� �޼��带 ������ �� �ִ�
	
	public static void swimContest(Swimmer s) {
		Swimmer.getTime();
		System.out.println(Swimmer.getTime());
		s.swim();
		s.kick();
		s.front();
	}
	
	
	public static void main(String[] args) {
		swimContest(new Bear());
		
		swimContest(new Swimmer() {
			@Override
			public void swim() {
				System.out.println("�͸��� ���������� ������ �߽��ϴ�.");
			}
			@Override
			public void kick() {
				System.out.println("�͸��� ���������� �����⸦ ������ �߽��ϴ�.");
			}
		
		});
	}
	
}

interface Swimmer {
	double water_regist = 123; 	// final static
	void swim();				// abstract public
	
	// �������̵� �� ���� ������, ���ϸ� �⺻������ ����ϰ� �Ǵ� �޼���
	default void kick() {
		System.out.println("���屸ġ��");
	}
	default void front() {
		System.out.println("�������ġ��");
	}
	static long getTime() {
		return System.currentTimeMillis();
	}
}

interface CookFish {
	void cookfish();
}


interface BoatDriving {
	void driveboat();
}

// �������̽����� ����� ���� �� �ְ�, ������ ���� �� �ִ�
interface Fishing extends BoatDriving, CookFish {
	void fish();
}




class Bear extends Animal implements Swimmer, Fishing {
	
	@Override
	public void swim() {
		System.out.println("����");
	}
	
	@Override
	public void fish() {
		System.out.println("������");
	}
	
	@Override
	public void driveboat() {
		
	}
	
	@Override
	public void cookfish() {

	}
	
}































