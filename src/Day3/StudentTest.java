package Day3;

class Student{
	String name;
	int age;
	void display() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
}

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Student s=new Student();
       s.name="Ram";
       s.age=23;
       s.display();
	}

}
