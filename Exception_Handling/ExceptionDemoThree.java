class  ExceptionDemoThree{
public static void main(String [] arrr){
	System.out.println("state 1");
	try{
		System.out.println(10/0);
	}
	catch(ArithmeticException e){
		System.out.println(10/2);
	}
}
}


















try{
	ste 1
	ste 2
	ste 3
}catch(Exception e){
	ste 4
}
ste 5

case 1:
Exception in ste 1
o/p=ste 4,ste 5   NT

case 2:
Exception in ste 2
O/P=ste 1,ste 4,ste 5  NT

case 3:
Exception in ste 4
O/P=AT

case 4:
Exception in ste 5
O/P AT