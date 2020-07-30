class JavaDeveloper{

private String name;
private String exprience;
private String coreJava;
private String advJava;
private String spring;
private String springBoot;

{
	System.out.println(" java Developer");
}
public JavaDeveloper(String n,String cj ,String advja){
	name =n;
coreJava =cj;
advJava =advja;
}

public JavaDeveloper(String n,String cj ,String advja ,String exp){
name =n;
coreJava =cj;
advJava =advja;
exprience =exp;
}

public JavaDeveloper(String n,String cj ,String advja ,String exp ,String sp ,String Sb){
name =n;
coreJava =cj;
advJava =advja;
exprience =exp;
spring =sp;
springBoot=Sb;
}
public 	void display(){
			System.out.println("Name ="+name);
		System.out.println("EXP ="+exprience);
		System.out.println("CORE JAVA ="+coreJava);
		System.out.println("ADV-JAVA="+advJava);
		System.out.println("SPRING="+spring);
		System.out.println("SPRING-BOOT="+springBoot);

}
}

class ConstructorOverloadingDemo{
public static void  main(String [] arr){
	
	JavaDeveloper vishu =new JavaDeveloper("vishu","yes","yes","1.7","yes","yes");
	JavaDeveloper himanshu =new JavaDeveloper("himanshu","yes","yes","1.7");
	JavaDeveloper abc =new JavaDeveloper("abc","yes","yes");
	
	System.out.println("Vishu info");
	vishu.display();
	System.out.println("=================================================");

	System.out.println("himanshu info");
	himanshu.display();
	
		System.out.println("=================================================");
		System.out.println("abc info");
	abc.display();
	
	}

}


