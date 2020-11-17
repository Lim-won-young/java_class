package myobj;

import java.util.Random;



	// 학생 클래스를 요소로 갖는 ArrayList를 (group) 생성하고 
	// 학생을 30명 추가해보세요
	
	// 1. 30명의 점수가 자동으로 설정되도록 만들어보세요
	
	// 2. 모든 학생의 평균 점수를 구하시오
	
	// 3. 반 평균을 구해보세요
	
	// 반 학생들의 평균을 구해줌

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
		this.name = String.format("테스트학생%04d", stu_count++);
		this.sum = kor + eng + math;
		this.avg = sum / (double)NOM_OF_SUBJECT;	
		
	}
	
	
	
	// ※ toString()은 Object 클래스의 메서드이기 때문에 모든 객체가 가지고 있다
	@Override
	public String toString() {
		// 이 객체를 문자열로 표현한다면 무엇일까? 에 대한 정의를 하는 메서드
		
		// String.format() : printf처럼 서식을 이용하여 원하는 문자열을 생성하는 메서드
		
		// return "[" + name + "/" + sum + "/" + avg + "]";
		
		return String.format("[%s/%d/%d/%.2f]", name,eng,sum,avg);
	}

	

	@Override
	public int compareTo(Student next_student) {
		// "이 클래스는 크기 비교를 이런식으로 하겠다"를 정의하는 곳
		//	- 양수를 리턴 : 현재 객체가 다음 객체보다 더 큼
		//	- 음수를 리턴 : 현재 객체가 다음 객체보다 더 작음
		///	- 0을 리턴	: 현재 객체와 다음 객체의 크기가 같음
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



