/*Create class box and box3d. box3d is extended class of box. The above
two classes going to pull fill following requirement
 Include constructor.
 set value of length, breadth, height
 Find out area and volume.
Note: Base class and sub classes have respective methods and instance
variables.*/
package Saiviharioopstasks5.java;

public class Box {
	double l;
	double b;
	double h;
	Box(double l,double b,double h)
	{
		this.l = l;
		this.b = b;
		this.h = h;
	}
	public void area() {
		double area =(2*(l*b+b*h+h*l));
		System.out.println("area of box "+area);
	
	}
	public void volume() {
		double volume = (l*b*h);
		System.out.println("volume of box "+volume);
	}
	
			
	

}
