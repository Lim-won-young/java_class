package myobj;

import java.util.Random;



	// �л� Ŭ������ ��ҷ� ���� ArrayList�� (group) �����ϰ� 
	// �л��� 30�� �߰��غ�����
	
	// 1. 30���� ������ �ڵ����� �����ǵ��� ��������
	
	// 2. ��� �л��� ��� ������ ���Ͻÿ�
	
	// 3. �� ����� ���غ�����
	
	// �� �л����� ����� ������

public class Student implements Comparable<Student> {
	
	int kor,eng,math;
	int sum;
	public double avg;
	String name;
	
	final static int NOM_OF_SUBJECT = 3;

	
	Random ran = new Random();
	
	static int stu_count = 0;
	
	public Student() {
		
		this.kor = ran.nextInt(71) + 30;
		this.eng = ran.nextInt(71) + 30;
		this.math = ran.nextInt(71) + 30;
		this.name = String.format("�׽�Ʈ�л�%04d", stu_count++);
		this.sum = kor + eng + math;
		this.avg = sum / (double)NOM_OF_SUBJECT;	
		
	}
	
	
	
	// �� toString()�� Object Ŭ������ �޼����̱� ������ ��� ��ü�� ������ �ִ�
	@Override
	public String toString() {
		// �� ��ü�� ���ڿ��� ǥ���Ѵٸ� �����ϱ�? �� ���� ���Ǹ� �ϴ� �޼���
		
		// String.format() : printfó�� ������ �̿��Ͽ� ���ϴ� ���ڿ��� �����ϴ� �޼���
		
		// return "[" + name + "/" + sum + "/" + avg + "]";
		
		return String.format("[%s/%d/%d/%.2f]", name,eng,sum,avg);
	}

	

	@Override
	public int compareTo(Student next_student) {
		// "�� Ŭ������ ũ�� �񱳸� �̷������� �ϰڴ�"�� �����ϴ� ��
		//	- ����� ���� : ���� ��ü�� ���� ��ü���� �� ŭ
		//	- ������ ���� : ���� ��ü�� ���� ��ü���� �� ����
		///	- 0�� ����	: ���� ��ü�� ���� ��ü�� ũ�Ⱑ ����
		if (this.eng > next_student.eng) {
			return 1;
		}
		else if (this.eng < next_student.eng) {
			return -1;
		}
		else {
			return 1;
		}
	}







}



