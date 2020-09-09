interface javaDeveloper{
		public boolean coreJava();
		public boolean spring();
		public boolean JPA();
}

class Vishu implements javaDeveloper {
		public boolean coreJava(){
			return true;
		}

		public boolean spring(){
			return true;
		}

		public boolean JPA(){
				return true;
		}

    
}


class Mukul implements javaDeveloper {
		public boolean coreJava(){
			return true;
		}

		public boolean spring(){
			return false;
		}

		public boolean JPA(){
				return false;
		}

}
class InterfaceDemo{

public static void main(String ...arr){
	

javaDeveloper  jd1 =new Vishu();
System.out.println(jd1.coreJava());
System.out.println(jd1.spring());
System.out.println(jd1.JPA());


System.out.println("===============================");

javaDeveloper  jd2 =new Mukul();
System.out.println(jd2.coreJava());
System.out.println(jd2.spring());
System.out.println(jd2.JPA());
}
}