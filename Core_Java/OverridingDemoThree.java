class P{

public Object m1(){
		return null;
}

}
class C extends P{

	public String m1(){
		return "ABC";
}


}
class OverridingDemoThree{

public static void main(String ...aa){

P p = new C();
System.out.println(p.m1());

}
}