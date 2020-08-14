class Test{

public void m1(String s1){
	System.out.println("String method");
}

public void m1(Object o){
	System.out.println("Object method");
}

}

class MethodOverloadingCaseTwo{

public static void main(String []arr){
Test t1 =new Test();
t1.m1("vishu");//String method
t1.m1(new Object());//Object method
t1.m1(null);//String method

}

}