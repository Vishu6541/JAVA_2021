class Student{
	
	private int rollNo =10;
	private String name = "vishu";
	private String school = "LJPSVM";
	
	public int getRollNo(){
		System.out.println("student class run");
		return rollNo;
	}
	
	public String getName(){
		return name;
	}
	public String getSchool(){
		return school;
	}
	
}
class MainClass {
	public static void main(String [] arr){
		Student  stu = new Student();
		int roll=stu.getRollNo();
		System.out.println(roll);
		
		System.out.println(stu.rollNo);
		
		
		
		
	}
	
}