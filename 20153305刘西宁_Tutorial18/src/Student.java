
public class Student {
	private String name;
	private int sno;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [姓名=" + name + ", 学号=" + sno + ", 年龄=" + age + "]";
	}
	
	public static int greaterThan(Student s1,Student s2){
		return s1.sno - s2.sno;
	}

	public static int lessThan(Student s1, Student s2) {
		return s2.sno - s1.sno;
	}

	public Student(String name, int sno, int age) {
		this.name = name;
		this.sno = sno;
		this.age = age;
	}	
	
	
	

}
