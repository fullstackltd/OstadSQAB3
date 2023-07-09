package hrm.pmis;

public class Person {
	// instance / object variable
	// "this" is a ketword to denote an object of this class
	int id;
	public String name;
	private int age;
	public static String planet = "Earth"; // static variable
	// constructor: is a special kind of method that is used to initialize value to instance variables
	// it is invoked / called automatically when only an object is instantiated / create / constructed
	// constructor dosen't have any return type
	// there two types of constructor.
	// 1. Default / no parameterized constructor
	// 2. Parameterized constructor
	// Constructor chaining
	
	public Person() {
		System.out.println("this is a constructor");
	}
	public Person(int id) {
		this();
		this.id = id;
		
	}
	public Person(int id, String name) {
		this(id);
		this.name = name;
		
	}
	public Person(String name, int id) {
		this.id = id;
		this.name = name;
	}
	public Person(int id, String name, int age) {
		this(id, name);
		this.age = age;
		
	}

	public Person(int id, int age, String name) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static String getPlanet() {
		return planet;
	}

	public static void setPlanet(String planet) {
		Person.planet = planet;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", planet=" + Person.planet + "]";
	}
	
	public void show() {
		System.out.println("Show");
	}
	// static block
	static {
		Person.planet = "Mars";
		System.out.println("My own planet : "+Person.planet);
	}
}
