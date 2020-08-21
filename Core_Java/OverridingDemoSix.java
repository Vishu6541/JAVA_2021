class P{

 public  void m1(){
		System.out.println("p m1");

}
}
class C extends P{

  protected void m1(){
	System.out.println("c m1");
}

}
class OverridingDemoSix{
public static void main(String ...aa){
P p =new C();
p.m1();
}
}