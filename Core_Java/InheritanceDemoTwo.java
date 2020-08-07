class P{

	public void m1(){
		System.out.println("parent");
	}
 
}

class C extends P{
	public void m2(){
		System.out.println("child");
	}
 
}


class InheritanceDemoTwo{

public static void main(String[]arr){
	
	//P p =new P();
    //p.m1();
	//p.m2();//error: cannot find symbol
	
	
	//C c1 =new C();
	//c1.m1();
	//c1.m2();
	
	//P p2 = new C();
	//p2.m1();
	//p2.m2();//error: cannot find symbol
	
	
	 C c =new P(); // error: incompatible types: P cannot be converted to C
	
}
}