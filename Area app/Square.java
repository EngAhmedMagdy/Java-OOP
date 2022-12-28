package play;

public class Square extends BaseShape implements Shape {
	
	double side;
	public Square(double side)
	{
		this.side = side;
	}
	@Override
	public void calculateArea() {
		double area = side*side;
		setArea(area);
	}
	
}
