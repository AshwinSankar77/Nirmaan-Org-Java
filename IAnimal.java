package day16;

public interface IAnimal {
	String name="Living Being";
	static boolean isMammal(String animalName ) {
		return (animalName.equalsIgnoreCase("dog"))||(animalName.equalsIgnoreCase("Cat"))||(animalName.equalsIgnoreCase("Human"));
	}
	default void speak() {
		System.out.println("Animal is making a Sound");
	}
	void move();

}
