
// �߻� Ŭ���� : Ŭ���� ���ο� �߻� �޼��带 ���� Ŭ����


// # �߻� �޼���
//	- �Լ��� ���¸� ���س��� �ڽ� Ŭ�������� �������̵带 �����ϰ� �����
// 	- �ڽ� Ŭ�������� �������̵� ���� ������ ������ ������ �߻��Ѵ�
//	- �ڽ� Ŭ������ ���� ������ �ش� �޼��尡 100% �����ϴ� ���� �����Ѵ�
//	- ��ĳ���� ���� �� �ڽ� Ŭ�������� ������ �ڵ带 ����ϰ� �ȴ�
	
	
// �ڽ� Ŭ�������� ���¸� �̸� ������ ��
// �ڽ� Ŭ�������� �޼��带 �������̵� �Ͽ� ����ϰ� �����


public class C06_abstract {
	public static void main(String[] args) {
		
		// Test
		
		Job j1 = new Programmer("������");
		Job j2 = new FireFighter("��ҹ�");
		
		Programmer p1 = (Programmer)j1;
		FireFighter f1 = (FireFighter)j2;
		
		System.out.println(p1.name);
		System.out.println(f1.name);
		
		System.out.printf("%d���� %s�� ���� : %.2f����\n",p1.workingyears,p1.jobN,j1.salary());
		System.out.printf("%d���� %s�� ���� : %.2f����\n",f1.workingyears,f1.jobN,j2.salary());
	}
}


//abstract Ŭ������ �װ��� ��ӹ޴� ���̽��� ���� �غ�����


abstract class Job {
	abstract public double salary();
}




class Programmer extends Job {
	
	String name;
	String jobN;
	int basicsalary;
	int workingyears;
	
	
	public Programmer(String name) {
		this();
		this.name = name;
	}
	public Programmer() {
		this.basicsalary = 2400;
		this.workingyears = 10;
		jobN = "���α׷���";
	}
	
	@Override
	public double salary() {
		double realsalary = this.basicsalary * 1.05;
		
		for (int i =0; i < this.workingyears-1; i++ ) {
			realsalary *= 1.05;
		}
		return realsalary;
	}
}

class FireFighter extends Job {
	String name;
	String jobN;
	int basicsalary;
	int workingyears;
	
	public FireFighter(String name) {
		this();
		this.name = name;
	}
	public FireFighter() {
		this.basicsalary = 2400;
		this.workingyears = 10;
		jobN = "�ҹ��";
	}
	
	@Override
	public double salary() {
		double realsalary = this.basicsalary * 1.1;
		
		for (int i =0; i < this.workingyears-1; i++ ) {
			realsalary *= 1.1;
		}
		return realsalary;
	}
}














