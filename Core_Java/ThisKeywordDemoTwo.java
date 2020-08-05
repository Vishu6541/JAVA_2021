class AB{

private int a,b;

public AB(){
	this(1,2);
System.out.println("first cons..");
}

public AB(int a,int b){
System.out.println("second cons..");
}

}
class ThisKeywordDemoTwo{
	
	public static void main(String[]arr){
		AB a =new AB();
	}

}