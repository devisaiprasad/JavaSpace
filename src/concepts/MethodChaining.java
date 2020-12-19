package concepts;

public class MethodChaining {

	private String name;
	private int age;

	// In addition to having the side-effect of setting the attributes in question,
	// the setters return "this" (the current Person object) to allow for further
	// chained method calls.

	public MethodChaining setName(String name) {
		this.name = name;
		return this;
	}

	public MethodChaining setAge(int age) {
		this.age = age;
		return this;
	}

	public void introduce() {
		System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
		
	}

	public static void main(String[] args) {
		
		MethodChaining person = new MethodChaining();
		// Output: Hello, my name is Peter and I am 21 years old.
		person.setName("Peter").setAge(25).introduce();

	}

}
