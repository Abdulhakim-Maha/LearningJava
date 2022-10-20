public class Organization {
	
	private String name;
	private float yearsOfExperience;


	public Organization(String name, float yearsOfExperience) {
		this.name = name;
		this.yearsOfExperience = yearsOfExperience;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public float getYearsOfExperience() {
		return yearsOfExperience;
	}
	public void setYearsOfExperience(float yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

}
