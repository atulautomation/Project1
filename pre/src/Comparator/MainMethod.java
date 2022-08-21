package Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class MainMethod {

	public static void main(String[] args) {
		ArrayList<Student> list=new ArrayList<>();
		list.add(new Student(4, "sk", 56));
		list.add(new Student(1, "dp", 52));
		list.add(new Student(3, "pd", 89));
		list.add(new Student(34, "pk", 43));
		list.add(new Student(12, "av", 25));
		Code(list);
		
		
	}

	private static void Code(ArrayList<Student> list)
	{
		Staff staff=new Staff();
		Collections.sort(list,staff);
		System.out.println(list);
		
	}

}
