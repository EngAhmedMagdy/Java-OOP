package play;

public class Cart {
	Order[] orders = new Order[100];
	int count ;
	Cart(){
		count = 0;
	}
	public void addToCart(Order order)
	{
		orders[count] = order;
		count++;
	}
	public void deleteFromCart()
	{
		count--;
	}
	
	public void printAll()
	{
		for(int i = 0;i<count;i++)
		{
			System.out.println("order "+i);
			System.out.println("order name: "+ orders[i].Name);
			System.out.println("order price: "+orders[i].Price);
		}
		System.out.println("________________");

	}
}
