class Test{

public void m1(int i){
	System.out.println("int method");
}

public void m1(float f){
	System.out.println("float method");
}

}

class MethodOverloadingCaseOne{

public static void main(String []arr){

byte b=10;
Test t1 =new Test();

t1.m1(10);//int method
t1.m1(10.5f);//float method
t1.m1('a'); ////int method
t1.m1(b);//int method
t1.m1(10.6);// error no suitable method found for m1(double)
}

}