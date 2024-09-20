
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Pizza pizza = new Pizza(true); // non-veg pizza
	        pizza.addExtraToppings();
	        pizza.addExtraCheese();
	        pizza.takeAway();
	        pizza.getBill();
	        
	        
	        DeluxPizza dp = new DeluxPizza(false);
	        dp.addExtraCheese();
	        dp.addExtraToppings();
	        dp.takeAway();
	        dp.getBill();
	        
	    }

	}
