class ExceptionDemoFour{
public static void main(String [] arrr){
	System.out.println("state 1");
	try{
		System.out.println(10/0);
	}
	catch(Exception e){
		e.printStackTrace(); //complete Exception info
		System.out.println(e.toString()); //Only Exception+description
		System.out.println(e.getMessage()); // only discription
		
	}
}

}