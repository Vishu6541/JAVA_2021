class A {

static int a;

static{
	a=5;
	System.out.println("static block call");
}

public A(){
System.out.println("A consructor call");
}

}

class StaticDemoTwo{
public static void main(String[]aee){
A a =new A();
}
}