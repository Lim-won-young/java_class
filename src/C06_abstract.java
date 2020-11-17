
// 추상 클래스 : 클래스 내부에 추상 메서드를 지닌 클래스


// # 추상 메서드
//	- 함수의 형태만 정해놓고 자식 클래스에서 오버라이드를 구현하게 만든다
// 	- 자식 클래스에서 오버라이드 하지 않으면 컴파일 에러가 발생한다
//	- 자식 클래스에 같은 형태의 해당 메서드가 100% 존재하는 것을 보장한다
//	- 업캐스팅 했을 때 자식 클래스에서 구현된 코드를 사용하게 된다
	
	
// 자식 클래스들의 형태를 미리 결정한 뒤
// 자식 클래스들이 메서드를 오버라이드 하여 사용하게 만든다


public class C06_abstract {
	public static void main(String[] args) {
		
		// Test
		
		Job j1 = new Programmer("김프로");
		Job j2 = new FireFighter("김소방");
		
		Programmer p1 = (Programmer)j1;
		FireFighter f1 = (FireFighter)j2;
		
		System.out.println(p1.name);
		System.out.println(f1.name);
		
		System.out.printf("%d년차 %s의 연봉 : %.2f만원\n",p1.workingyears,p1.jobN,j1.salary());
		System.out.printf("%d년차 %s의 연봉 : %.2f만원\n",f1.workingyears,f1.jobN,j2.salary());
	}
}


//abstract 클래스와 그것을 상속받는 케이스를 설계 해보세요


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
		jobN = "프로그래머";
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
		jobN = "소방관";
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














