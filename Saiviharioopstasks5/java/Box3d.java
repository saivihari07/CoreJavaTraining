package Saiviharioopstasks5.java;

public class Box3d {
		int l;
		int b;
		int h;
		Box3d(int l,int b,int h)
		{
			super();
			this.l = l;
			this.b = b;
			this.h = h;
		}
		public void area1() {
			int area =(2*(l*b+b*h+h*l));
			System.out.println("area of box"+area);
		
		}
		public void volume1() {
			int volume = (l*b*h);
			System.out.println("volume of box"+volume);
		}
		
}
