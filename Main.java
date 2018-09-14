import java.util.Scanner;


class Student{
	private String name;
	private	int age;
	private	int course;
	private	String hobbi;

	public void setAge(int x){
		this.age = x;
	}
	public void setName(String x){
		this.name = x;
	}
	
	public void setCourse(int x){
		this.course = x;
	}
	public void setHobbi(String x){
		this.hobbi = x;
	}
	public int getAge(){
		return this.age;
	}
	public String getName(){
		return this.name;
	}
	public String getHobbi(){
		return this.hobbi;
	}
	public int getCourse(){
		return this.course;
	}
}

interface ModelLayer{
	void setStudentattr(Student student);
	Student getStudent();
}

class DBLayer implements ModelLayer{
	@Override
	public void setStudentattr(Student student){
		int age,course;
		String name,hobbi;
		Scanner sc = new Scanner(System.in);
		System.out.println("Imput the name of student: ");
		name  = sc.nextLine();
		System.out.println("Imput the age of student: ");
		age = sc.nextInt();
		System.out.println("Imput the course of student: ");
		course = sc.nextInt();
	    System.out.println("Imput the hobbi of student: ");
		hobbi = sc.next();
		student.setName(name);
		student.setAge(age);
		student.setCourse(course);
		student.setHobbi(hobbi);
	}

	@Override
	public Student getStudent(){
		return new Student();
	}
}

interface View{
	void showStudent(Student student);
}

class ConsoleView implements View{
	@Override
	public void showStudent(Student student){
		System.out.println("Name of a studnet: |" + student.getName() + "\nAge:      	   |" + student.getAge() + "\nCourse:		   |" + student.getCourse() + "\nHobbi: 		   |" + student.getHobbi());
	}
}

class Controller{
	ModelLayer modelLayer = new DBLayer();
	View view = new ConsoleView();
	void execute(){
		Student student = modelLayer.getStudent();
		modelLayer.setStudentattr(student);
		view.showStudent(student);
	}
}

public class Main{
	public static void main(String[] args){
		Controller controller = new Controller();
		controller.execute();
	}
}