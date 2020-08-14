class Test{

public void m1(int i ){
	System.out.println("int  method 1.0");
}

public void m1(int ...i){
	System.out.println(" int var-args method 1.5");
}


}

class MethodOverloadingCaseFive{

public static void main(String ...arr){ 
Test t1 =new Test();

t1.m1();//int var-args method
t1.m1(10,20);//int var-args method

t1.m1(10);
}

}