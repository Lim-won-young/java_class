import java.util.Scanner;
import myobj.fruit.*;
import myobj.vehicle.Bus;






public class C02_OOP {
	
	// # 객체지향 프로그래밍 (OOP : Object Oriented Programming)
	// - 세상에 존재하는 모든 것들을 변수와 함수로 표현하려는 프로그래밍 방법
	// - 변수와 함수를 무분별하게 사용하기 보다는 현실에 존재하는 객체처럼 보이도록 하여 가독성을 올린다
	// - 객체 (Object) : 세상에 존재하는 모든 개념을 말한다 (사물, 개념, 알고리즘 등등)
	
	// ex : 학생
	// - 학생의 변수	: 성적, 성별, 키, 학년 ...
	// - 학생의 메서드	: 시험을 친다 (최신 성적으로 업데이트), 1년이 지남 (학년이 올라감)
	
	// ex : 사과
	// - 사과의 변수 	: 크기, 색깔, 수확 날짜, 당도, 보유 칼로리 ....
	// - 사과의 메서드 	: 먹는다 (크기, 칼로리 변화), 갈변 (색, 당도), 던진다 (보유한 데미지에 따라 맞았을 때 아픈 정도가 달라진다)
	
	// ※ 메서드 : 객체의 변수에 영향을 미치거나 받는 함수를 메서드라고 부른다
	
	// # 클래스 (Class)
	
	// - 객체를 프로그래밍 언어로 표현한 것
	// - 클래스는 객체의 설계도이다 (만든 시점에서는 실체가 없음)
	// - 클래스를 통해 생성하는 실제 객체를 '인스턴스' 라고 부른다 
	// - 클래스는 참조형 변수 타입이다
	//	(만약 사과 클래스를 만든다면 사과 타입을 사용할 수 있게 된다)
	
	public static void main(String[] args) {
		
//		// Scanner 설계도로 실체(Scanner 인스턴스)를 만들어 그 실체의 주소를 변수 sc에 저장
//		Scanner sc = new Scanner(System.in);
//		
//		
//		// Apple 설계도로 실체(Apple 인스턴스)를 만들고 그 실체의 주소를 변수 apple01에 저장
//		Apple apple01 = new Apple();
//		Apple apple02 = new Apple();
//		Apple apple03 = new Apple();
//		
//		// 클래스 타입 배열을 만든 시점에서는 인스턴스가 생성되지 않았다
//		// (배열의 실체만 생성됨)
//		Apple[] appleBox = new Apple[10];
//		
//		
//		// 모든 배열에 사과의 실체를 생성
//		for (int i = 0; i < appleBox.length; i ++) 
//			appleBox[i] = new Apple();
//		
//		
//		apple02.sweet = 10;
//		apple03.sweet = 8;
//		
//		// 실체가 생겼으므로 미리 만들어둔 설계도대로 사용할 수 있다
//		apple01.birthday = "2020/10/29";
//		apple01.size = 10;
//		apple01.calorie = apple01.size * 10;
//		apple01.color = "red";
//		apple01.sweet = 7;
//		
//		for (int i = 0; i <3; i++) {
//			apple01.eat();
//			apple02.eat();
//			apple03.eat();
//		}
		
		
		// 1. myobj.fruit 패키지에 클래스 하나 정의하고 인스턴스를 생성
		
		Banana banana01 = new Banana();
		banana01.attack();
		
		
		
		// 2. myobj.vehicle 패키지에 클래스를 하나 정의하고 인스턴스를 생성
		
		Bus bus01 = new Bus();
		bus01.revenue();
		
		// ※ 각 클래스는 변수 3개 이상 메서드 1개 이상
	}
}



















