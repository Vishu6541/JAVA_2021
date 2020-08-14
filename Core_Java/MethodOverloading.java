class Sum{

public void  sum(int a ,int b){
System.out.println("Sum of int \n "+(a+b));
}

public void  sum(double a ,double b){
System.out.println("Sum of double       ");
System.out.print(a+b);
}

public void sum(String s1 ,String s2){
System.out.println("Sum of String = "+s1+s2);
}
}

class MethodOverloading{

public static void main(String arr){
	System.out.println(arr);
}

public static void main(String [] arr){
Sum obj =new Sum();
obj.sum(1125,1256);
main("vishu");

}

}