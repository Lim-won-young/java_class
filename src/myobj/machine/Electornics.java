package myobj.machine;

public interface Electornics {
	
	// ���� ��� �������̽�
	
	// 1. ��� ���ڱ��� ���� ������ ���� �� �ִ�
	
	// 2. ��� ���ڱ��� �ֿܼ� �ѹ� ����� �� ���� ���� �Һ� ��ŭ�� ������ �Һ��Ѵ�
	
	// 3. ��� ���ڱ��� ������ �ִ� ������ �ֿܼ� ����Ѵ�
	int st_consumption = 500;
	
	void charge(int a);
	
	void action();
	
	void checkBattery();
	
	void checkConsumption();
	
	
}
