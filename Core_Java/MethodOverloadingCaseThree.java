class Test{

public void m1(String s1){
	System.out.println("String method");
}

public void m1(StringBuffer s2){
	System.out.println("StringBuffer method");
}

public void m1(Object s2){
	System.out.println("Object method");
}


}

class MethodOverloadingCaseThree{

public static void main(String []arr){
Test t1 =new Test();

t1.m1("vishu");//String method
t1.m1(new StringBuffer("vishu"));//StringBuffer method

t1.m1(null);// error: reference to m1 is ambiguous

}

}