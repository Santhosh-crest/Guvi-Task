package day11;

public class Circle {
	int radius=20;
	double pi=Math.PI;
	 double circumference(double pi,int radius) {
		 double circum=2*pi*radius;
		 return circum;
	 }
	 double circumference1() {
		 double circum=2*pi*radius;
		 return circum;
	 }
	 
	 public Circle() {
		 
	 }
	 public Circle(double pi,int radius) {
		 this.pi=pi;
		 this.radius=radius;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle obj=new Circle();
		double val=obj.circumference(Math.PI,5);
		double val1=obj.circumference1();
		System.out.println(val);
		System.out.println(val1);

	}

}