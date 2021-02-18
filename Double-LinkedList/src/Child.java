
public class Child {
	private int age;
	private String name;
	public Child next;

	public Child(int age, String name) {
		// TODO Auto-generated constructor stub
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}
	public String getName() {
		return this.name;
	}
	
	public void displayChild() {
		System.out.print("{ "+this.name+", "+this.age+" }");
	}

}
