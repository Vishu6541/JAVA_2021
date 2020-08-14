class Test{

public void m1(int i ,float f){
	System.out.println("int float  method");
}

public void m1(float f ,int i){
	System.out.println("float int method");
}


}

class MethodOverloadingCaseFour{

public static void main(String []arr){
Test t1 =new Test();

t1.m1(10,10.6f);//int float  method
t1.m1(10.5f,10);//float int method
t1.m1(10,10); //  error: reference to m1 is ambiguous

}

}