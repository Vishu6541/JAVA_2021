class Area{

  int length;
  int breadth;
  
  
  public Area(int length , int breadth){
  
	this.length=length;
	this.breadth=breadth;
  
  }
  
  public void display(){
  
  System.out.println("Length ="+length);
  System.out.println("Breadth ="+breadth);
  
  }
}
class Rectangle extends Area{

public Rectangle(int length , int breadth){
	super(length,breadth);

}

public void areaDisplay(){
System.out.println("Area of Rectangle="+length*breadth);
}

}

class Cuboid extends Area{
	
	int height;

public Cuboid(int length , int breadth,int height){
	super(length,breadth);
	this.height=height;
}

public void display(){
	super.display();
	System.out.println("height="+height);
}

public void areaDisplay(){
System.out.println("Area of Cuboid="+length*breadth*height);
}

}

class InheritanceCodeReusability{

public static void main(String[]arr){

Rectangle rect =new Rectangle(10,20);
rect.display();
rect.areaDisplay();

Cuboid cub = new Cuboid(20,30,40);
cub.display();
cub.areaDisplay();
}

}