package polimophism;

public class Employee {

	// private:
	// protected
	// public
	// default
	private int id;
	private String designation;
	public double salary;
	protected int land;
	int localClub;

	public Employee(int id, String designation, double salary) {
		super();
		this.id = id;
		this.designation = designation;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if (id >= 0) {
			this.id = id;
		}
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", designation=" + designation + ", salary=" + salary + ", land=" + land
				+ ", localClub=" + localClub + "]";
	}

	// method overloading
	public int add() {
		return 0;
	}

	public int add(int a, int b) {
		return a + b;
	}

	public double add(int a, double b) {
		return a + b;
	}

	public double add(double a, double b) {
		return a + b;
	}

	public double add(double a, int b) {
		return a + b;
	}

	public int add(int a, int b, int c) {
		return a + b + c;
	}
}
