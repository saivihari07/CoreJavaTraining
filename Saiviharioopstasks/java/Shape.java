
package Saiviharioopstasks.java;

class Shape {
	public void area() {
		System.out.println("qwerty");
	}

	public void perimeter() {
		
	}

	public static void main(String[] args) {
		Shape s = new Circle();
		Shape s1 = new Triangle();
		Shape s2 = new Square();
		s.area();
		s.perimeter();
		s1.area();
		s1.perimeter();
		s2.area();
		s2.perimeter();
	}
}

class Circle extends Shape {
	public void area() {
		System.out.println("Circle area is");
	}

	public void perimeter() {
		System.out.println("Circle perimeter");

	}
}

class Triangle extends Shape {
	public void area() {
		System.out.println("Triangle area");
	}

	public void perimeter() {
		System.out.println("Triangle perimeter");
	}
}

class Square extends Shape {
	public void area() {
		System.out.println("Square area");
	}

	public void perimeter() {
		System.out.println("Square perimeter");
	}

}
