package play;

public class AppOrders {

	public static void main(String[] args) {
		Cart myCart = new Cart();
		Order myOrder1 = new Order("sandwidsh",100);
		Order myOrder2 = new Order("fries",200);
		Order myOrder3 = new Order("coca",300);
		myCart.addToCart(myOrder1);
		myCart.addToCart(myOrder2);
		myCart.addToCart(myOrder3);
		myCart.printAll();
		myCart.deleteFromCart();
		myCart.printAll();
		myCart.addToCart(myOrder1);
		myCart.printAll();
	}

}
