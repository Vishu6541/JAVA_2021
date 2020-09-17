class ExceptionDemoFive{
public static void main(String [] arrr){

	try{
		String s1 = null;
	//	System.out.println(10/0);
		System.out.println(s1.trim());
		
	}
	catch(ArithmeticException e){
			System.out.println(10/2);
	}
	catch(NullPointerException e){
			System.out.println(e.toString());
	}
	catch(Exception e){
			System.out.println(e.toString());
	}
}

}