package play;

public class Rectangle extends BaseShape implements Shape {
	
		
		double length;
		double width;
		public Rectangle(double length,double width)
		{
			this.length = length;
			this.width = width;
		}
		@Override
		public void calculateArea() {
			double area = length*width;
			setArea(area);
		}
}
