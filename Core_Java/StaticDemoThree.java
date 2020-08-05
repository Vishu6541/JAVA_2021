class A {

static{
	System.out.println("A static block call");
}
public static void display(){
System.out.println("A display method invoke");
}


}
class B {

static{
	System.out.println("B static block call");
}

public  B(){
System.out.println("B constructor call");
}

}
class C{

public static int value;
static{
	value=10;
	System.out.println("C static block call");
}
public static void display(){
System.out.println("C display method invoke");
}

}

class StaticDemoThree{
	static{
	System.out.println("StaticDemoThree static block is call");
	}
	
	public static void main(String [] arr){
	
	System.out.println("main method is call");
	A.display();
	
	B b =new B();
	C.display();
	C c =new C();
	
	}
}
