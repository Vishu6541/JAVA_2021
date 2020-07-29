class Indian{

private int id;
private String name ;
private String gen ;

public Indian(int a ,String n,String g){
	id=a;
	name =n;
	gen =g;
}


public int getID(){
	return id;
}
public String getName(){
	return name;
}
public String getGen(){
	return gen;
}

}
class ConstructorDemo{
	public 	static void main(String[]Aaa){
		
		Indian vishu =new Indian(1,"Vishu","M");
		System.out.println(vishu);
		System.out.println(vishu.getID());
		System.out.println(vishu.getName());
		System.out.println(vishu.getGen());
		
		Indian raja =new Indian(2,"raja","M");
		System.out.println("===================================");
		System.out.println(raja);
		System.out.println(raja.getID());
		System.out.println(raja.getName());
		System.out.println(raja.getGen());
		
	}
	
}