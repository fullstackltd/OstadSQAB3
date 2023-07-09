package polimophism;

public class DefaultClass {

	public void checkDefault() {
		Employee e = new Employee(2, "Programmer", 40000);
		e.localClub = 2;
		System.out.println(e);
	}
}
