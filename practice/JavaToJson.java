import java.util.*;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JavaToJson {
	public static void main(String[] args) {
		List<Organization> organizations = new ArrayList<>();
		Organization o1 = new Organization("Honeywell", 2.2f);
		Organization o2= new Organization("IBM", 1.8f);
		organizations.add(o1);
		organizations.add(o2);

		Employee emp = new Employee("austiniqer", "maha", 80000, organizations);

		// System.out.println(emp.toString());
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(emp);
		System.out.println(json);
	}		
}
