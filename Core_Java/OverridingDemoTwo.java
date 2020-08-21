class VishuParent{
	
	public void property(){
		System.out.println("Gold +Cash");
	}
	
	public final void marry(){
		System.out.println("Only Arrange Marrige");
	}
	
}

class Vishu extends VishuParent{
	
		
	public void marry(){
		System.out.println("Only Love Marrige");
	}
	
}

class VishuBro extends VishuParent{
	
	
}
class OverridingDemoTwo{

public static void main(String ...aa){

VishuParent vishuParent =new VishuParent();
System.out.println("===============VishuParent=============");
vishuParent.property();
vishuParent.marry();

System.out.println("===============Vishu=============");
Vishu vishu =new Vishu();
vishu.property();
vishu.marry();

System.out.println("===============VishuBro=============");
VishuBro vishuBro =new VishuBro();
vishuBro.property();
vishuBro.marry();
}
}
