import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Client {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("张浩", 20153304, 21));
		list.add(new Student("刘西宁", 20153305, 22));
		list.add(new Student("王志伟", 20153307, 20));
		list.add(new Student("曾凯", 20153318, 20));
		System.out.println("学号正序遍历输出：");
		order(list);
		System.out.println("学号倒序遍历输出：");
		reverseOrder(list);
	}

	public static void order(List<Student> list) {
		list.sort(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return Student.greaterThan(o1, o2);
			}

		});
		show(list);
		
	}

	public static void reverseOrder(List<Student> list) {
		list.sort(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return Student.lessThan(o1, o2);
			}

		});
		show(list);
	}
	
	public static void show(List<Student> list){
		for (Student student : list) {
			System.out.println(student);
		}
	}

}