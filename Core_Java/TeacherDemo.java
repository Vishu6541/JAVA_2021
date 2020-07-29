class Teacher{

   private int id=20;
   private String name ="XYZ";
	
	public int  getId(){
		return id;
	}
	
		public String  getName(){
		return name;
	}
	
}

class TeacherDemo{
	
	public static void main(String[]aee){
		
		Teacher t1 =new Teacher();
		
		System.out.println(t1.getId());
		System.out.println(t1.getName());
		
		
			}	
}