class A {

public void display(){
System.out.println("A class display method");
}

public static void invoke(A a){
	a.display();
}
}

class B extends A{

public void display(){
System.out.println("B class display method");
}

}
class C extends A{

public void display(){
System.out.println("c class display method");
}
}

class BindingTest{

public static void main(String [] arr){

A x =new A();
A.invoke(x);

B y =new B();
A.invoke(y);

C z=new C();
A.invoke(z);



}


}