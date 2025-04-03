package Lesson37_hometask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mainnn {
	public static void main(String[] args) {
		List<Name> names = new ArrayList<Name>();
		Name name1 = new Name("Umud");
		Name name2 = new Name("Elvin");
		Name name3 = new Name("Sabir");
		names.add(name1);
		names.add(name2);
		names.add(name3);
		System.out.println(names);
		Collections.sort(names, new Name(""));

		System.out.println(names);
	}
}
