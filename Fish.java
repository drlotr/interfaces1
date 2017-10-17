
public class Fish extends Animal implements Pet {
	private String fishName;
	public Fish() {
		super(0);
		fishName = "Piscene";
	}
	public String eat() {
		return "Snap snap snap of the coral";
	}
	public String getName() {
		return fishName;
	}
	public void setName(String name) {
		fishName = name;
	}
	public String walk() {
		return "Does Not Walk, Swims";
	}
	public void play() {
		System.out.println("Just keep swimming, he's it and you're about to be tagged!");
	}
	
}
