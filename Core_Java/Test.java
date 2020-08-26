class Test{
	
	public void sum(int a,int b ){
		System.out.println(a+b);
	}
	public void sum(float a,float b){
		System.out.println(a+b);
	}
	public void sum(String a,String b){
		System.out.println(a+b);
	}
 
	public static void main(String []arr){
		
		Test t1 =new Test();
		t1.sum("ABC","Vishu");
	}
	
	
}