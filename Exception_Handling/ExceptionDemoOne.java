class ExceptionDemoOne{

public static void main(String [] arrr){
		dostuff();
		 System.out.println("Hii Main");
		   System.out.println(10/0);

} 

public static	void dostuff(){
      doMoreStuff();
	  System.out.println(10/2);
	  
}

public static void doMoreStuff(){
  System.out.println("Hello");
 
}

}