
// import org.json.simple.JSONArray;
import java.util.ArrayList;
import java.util.List;

// import org.json.simple.JSONArray;
// import org.json.simple.JSONObject;

public class JSONTest {
	public static void main(String[] args) {
		List<String> ls = new ArrayList<>();
		ls.add("hello");
		ls.add("world");
		ls.add("!!!");

		String[] name = {"name","hell"};
		
		List <String> ss = List.of(name);
		System.out.println(ss);
		// ls.add(List.of(name));
		// System.out.println(ls);


	}	
}
