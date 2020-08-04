class Student{

private int  rollNo;
private String name;

private static  String   school;

static{
	school="LJPSVM";
}

public 	Student(int r,String n){
	rollNo =r;
	name =n;
}

public void display(){
	System.out.println(rollNo);
	System.out.println(name);
}

public static void schoolDisplay(){
		school = "jaba";
		System.out.println(Student.school);
}


}

class StaticDemo{
	public static void main(String[]aee){
		Student stu = new Student(1,"vishu");
		Student stu2 = new Student(2,"Himashu");
		stu.display();
		Student.schoolDisplay();
		System.out.println("=======================");
		stu2.display();
		Student.schoolDisplay();
	}
	
}
