package polimophism;

public class SalesMan extends Employee {
	private double salesIncentive;

	public SalesMan(int id, String designation, double salary, double salesIncentive) {
		super(id, designation, salary);
		super.land = 2;
		this.salesIncentive = salesIncentive;
	}

	public double getSalesIncentive() {
		return salesIncentive;
	}

	public void setSalesIncentive(double salesIncentive) {
		this.salesIncentive = salesIncentive;
	}

	@Override
	public String toString() {
		return "SalesMan [salesIncentive=" + salesIncentive + ", getId()=" + getId() + ", getDesignation()="
				+ getDesignation() + ", getSalary()=" + getSalary() + "]";
	}
	
	@Override
	public int add(int a, int b) {
		System.out.println("SalesMan");
		return a + b;
	}
	public int add(int a, int b, int c, int d) {
		return a + b + c + d;
	}
	
	public void show() {
		DefaultClass dc = new DefaultClass();
		dc.checkDefault();
	}
}
