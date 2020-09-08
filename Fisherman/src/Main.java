
public class Main {

	
	//CookSeafood cookSeafood = new CookSeafood();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Seafood seafoods = new Seafood(456, "Crustacean" , 3);
		Seafood seafoods2 = new Seafood(456, "Fish" , 3);
			
		SeafoodType seafood = new SeafoodType(seafoods.size, seafoods.name, seafoods.cookType);
		SeafoodType seafood2 = new SeafoodType(seafoods2.size, seafoods2.name, seafoods2.cookType);
				
		System.out.println(seafood.cook(null, 0) + " " + seafood.setSeafoodType(null));
		System.out.println(seafood2.cook(null, 0) + " " + seafood2.setSeafoodType(null));
	
		Basket basket = new Basket();
		System.out.println(basket.put(0));
		System.out.println(basket.set(0));
	}

	
}
