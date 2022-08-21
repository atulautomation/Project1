package Comparable;

public class Student implements Comparable<Student>
{
	int rn;
	String name;
	int marks;
	public Student(int rn, String name, int marks) {
		super();
		this.rn = rn;
		this.name = name;
		this.marks = marks;
	}
	
	public String toString() {
		return "Student [rn=" + rn + ", name=" + name + ", marks=" + marks + "]";
	}

	
	@Override
	public int compareToNew(Student s)
	{
		if(rn>s.rn)
			return 1;
		else if(rn<s.rn)
			return -1;
		else
		{
			if(marks>s.marks)
				return 1;
			else if(marks<s.marks)
				return -1;
			else
				
				return name.compareTo(s.name);
				
		}

@Override
	public int compareTo(Student s)
	{
		if(rn>s.rn)
			return 1;
		else if(rn<s.rn)
			return -1;
		else
		{
			if(marks>s.marks)
				return 1;
			else if(marks<s.marks)
				return -1;
			else
				
				return name.compareTo(s.name);
				
		}
	
		
	}
	
	
}
