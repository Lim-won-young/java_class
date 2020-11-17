
import myobj.animal.Animal;

public class C10_AnonymousClass {
	
	// # �͸� Ŭ����
	//	- Ŭ������ �� �����Ͽ� ����ϴ� ���
	// 	- ���� ������� �ʰ� �ѹ��� ����Ѵ�
	
	
	public static void useAnimal(Animal animal) {
		animal.breath();
		animal.eat();
	}
	
	
	
	public static void main(String[] args) {
		Animal animal01 = new Animal();
		
		// �̷��� ������ Ŭ������ �ٽô� ����� �� ���� ������ �͸� Ŭ������ �Ҹ���
		// (Animal�� ��ӹ��� �̸����� Ŭ������ �ۼ��� �� �ִ�)
		Animal animal02 = new Animal() {
			
			@Override
			public void breath() {
				System.out.println("������� ������");
			}
			@Override
			public void eat() {
				System.out.println("������� ���� �Ա�");
			}
			
		};
		
		// �͸����� ������ ���ο� Ŭ������ �Լ��� ���ڷ� ����
		useAnimal(new Animal() {
			@Override
			public void breath() {
				System.out.println("����̰� ���� ���ϴ�");
			}
			@Override
			public void eat() {
				System.out.println("����̰� ��ġĵ�� �Խ��ϴ�");
			}
			
		});
		
		useAnimal(animal01);
		useAnimal(animal02);
		
		
		
		// # �߼� Ŭ������ �ν��Ͻ�ȭ�� �Ұ����ϴ�
		abstract class Monster {
			int attack;
			int hp;
			
			public Monster(int attack, int hp) {
				this.attack = attack;
				this.hp = hp;
				
			}
			
			abstract void attack();
			abstract void attacked();
		}
		
		class ABC extends Monster{
			
			
			public ABC(int attack, int hp) {
				super(attack,hp);
			}
			@Override
			void attack() {	
			}

			@Override
			void attacked() {	
			}
		}
		
		
		Monster monster = new Monster(50, 300) {
			@Override
			void attacked() {
				System.out.println("ü���� 1 �����߽��ϴ�.");
			}
			
			@Override
			void attack() {
				System.out.printf("%d�� ���ݷ����� �����մϴ�.\n",attack*150);
			}
		};
		
		monster.attack();
		monster.attacked();
	}
}






