package Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class MainMethod {

	public static void main(String[] args)
	{
		ArrayList<Student> list=new ArrayList<>();
		list.add(new Student(1, "anu", 78));
		list.add(new Student(4, "pranav", 87));
		list.add(new Student(76, "dk", 43));
		list.add(new Student(3, "sk", 79));
		list.add(new Student(8, "dp", 35));
		list.add(new Student(1, "anu", 78));
		list.add(new Student(4, "pranav", 87));
		list.add(new Student(76, "dk", 43));
		list.add(new Student(3, "sk", 79));
		Code(list);


	}

	private static void Code(ArrayList<Student> list)
	{
		
		Collections.sort(list);
		System.out.println(list);
	}

}
