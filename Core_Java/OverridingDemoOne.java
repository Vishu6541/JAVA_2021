class A{
public void Home(){
	System.out.println(" krishna home");
}
}
class B extends A{
	public void Home(){
	System.out.println("ABC Home");
}
}

class OverridingDemoOne{

public static void main(String ...aa){

B b =new B();
b.Home();

}
}
