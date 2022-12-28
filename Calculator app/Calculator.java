package play;

public class Calculator {
	public double result;
	private void sum(double x,double y)
	{
		this.result = x + y;
	}
	private void subtract(double x,double y)
	{
		this.result = x - y;
	}
	private void multiple(double x,double y)
	{
		this.result = x * y;
	}
	private void divide(double x,double y)
	{
		this.result = x / y;
	}
	
	public void makeCalculation(double x,double y,int operator)
	{
		switch(operator)
		{
			case 1:
				sum(x,y);
				break;
			case 2:
				subtract(x,y);
				break;
			case 3:
				multiple(x,y);
				break;
			case 4:
				divide(x,y);
				break;
		}
		
	}
	public double getResult(){
		return result;
	}
}
