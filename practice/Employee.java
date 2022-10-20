import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String firstname;
	private String lastname;
	private double salary;
	private List<Organization> org = new ArrayList<Organization>();



	public Employee(String firstname, String lastname, double salary, List<Organization> org) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.salary = salary;
		this.org = org;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public List<Organization> getOrg() {
		return org;
	}

	public void setOrg(List<Organization> org) {
		this.org = org;
	}
}
