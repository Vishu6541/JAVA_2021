class Teacher{
	
	public int id;
	public String name;
	
	public Teacher(int id,String name){
		this.id =id;
		this.name =name;
	}
	
}
class ThisKeywordDemoOne{
	
	public static void main(String[]arr){
		Teacher t1 =new Teacher(1,"abc");
		Teacher t2 =new Teacher(1,"vishu");
		
		System.out.println(t1.id);
		System.out.println(t1.name);
		
		System.out.println(t2.id);
		System.out.println(t2.name);
		
	}
}
 
