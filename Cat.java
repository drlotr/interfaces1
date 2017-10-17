
public class Cat extends Animal implements Pet {
	private String catName;
	public Cat(String name) {
		super(4);
		catName = name;
	}
	public Cat() {
		super(4);
		catName = "";
	}
	public String getName() {
		return catName;
	}
	public void setName(String name) {
		catName = name;
	}
	public void play() {
		System.out.println("The cat leaps after the dot of the lazer");
	}
	public String eat() {
		return "Crunch Crunch Crunch";
	}

}
