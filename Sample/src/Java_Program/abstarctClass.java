package Java_Program;
/*class base
{
	public base() {
		// TODO Auto-generated constructor stub
		System.out.println("constructor of base class!!");
	}
}

public class abstarctClass {

}*/


interface Drawable{  
void draw();  
}  
//Implementation: by second user  
class Rectangle implements Drawable{  
public void draw(){System.out.println("drawing rectangle");}  
}  
class Circle implements Drawable{  
public void draw(){System.out.println("drawing circle");}  
}  
//Using interface: by third user  
class abstarctClass{  
public static void main(String args[]){  
Drawable d;
d=new Rectangle();
d.draw();
d=new Circle();//In real scenario, object is provided by method e.g. getDrawable()  
d.draw();  
}}  
