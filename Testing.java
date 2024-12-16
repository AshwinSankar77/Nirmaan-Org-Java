package day16;

 class Dog implements IAnimal {

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Dog runs on four legs");
	}
	public void speak() {
		System.out.println("The Dog says Woof Woof!");
	}
 }
class Bird implements IAnimal{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("The Bird Flies in the Sky");
	}
	public void speak() {
		System.out.println("The Bird says: chirp chirp!");
	}
	
}

public class Testing {
	public static void main(String[] args) {
		System.out.println(IAnimal.name);
		Dog dog = new Dog();
		Bird bird = new Bird();
		dog.move();
		dog.speak();
		bird.move();
		bird.speak();
		System.out.println(IAnimal.isMammal("dog"));
		System.out.println(IAnimal.isMammal("bird"));
		}
}
