class P{

String s ="ABC"; 

}

class C extends P{

String s ="India"; 

public void m1(){
System.out.println(s);
System.out.println(this.s);
System.out.println(super.s);
}


}

class Test{
public static void main(String[]arr){

C c =new C();
c.m1();

}

}