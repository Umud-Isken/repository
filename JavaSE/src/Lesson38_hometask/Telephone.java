package Lesson38_hometask;

import java.util.HashMap;
import java.util.Map;

public class Telephone {
	public static void main(String[] args) {
		Map<String, String> kontact =new HashMap<String, String>();
		kontact.put("Umud", "Iskenderov");
		kontact.put("Nurkxan", "Akhverdiyev");
		kontact.put("Sabir", "Miraliyev");
//		System.out.println(kontact.containsKey("Umud"));
		System.out.println(kontact);
	}
}
