class A {

public A(){

System.out.println("IN A");
}

}

class B extends A{
int x;
public  B(){
	
}
public B(int x){
this.x=x;
System.out.println("IN B ");
}

}

class C extends B{

public C(){
	
System.out.println("IN C");
}

public static void main(String[]arr){

A a=new A();
B b=new B(10);
C c =new C();
}

}
