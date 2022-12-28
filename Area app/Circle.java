package play;

public class Circle extends BaseShape implements Shape {
	
	double radius;
	double pi = 22.0/7.0;
	public Circle(double radius)
	{
		this.radius = radius;
	}
	@Override
	public void calculateArea() {
		double area = radius*pi;
		setArea(area);
	}
}
