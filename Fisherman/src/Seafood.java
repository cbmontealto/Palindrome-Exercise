
public class Seafood extends Basket implements CookSeafood {

	int size;
	String name;
	int cookType;
	
	public Seafood (int size, String name, int cookType){
		this.size = size;
		this.name = name;
		this.cookType = cookType;
	}

	
	@Override
	public String cook(String cooked, int cookeType) {
		if(cookType == 1) {
			cooked = "Grilled";
		}
		else if(cookType == 2) {
			cooked = "Steamed";
		}
		else if(cookType == 3) {
			cooked ="Fried";			
		}
		else if(cookType == 4) {
			cooked = "Boiled";
		}
		else if(cookType == 5) {
			cooked = "Corned";
		}
		else if(cookType <= 0 || cookType > 5){
			cooked = "Spoiled/Waisted";
		}
		return cooked;
	}
	
	
	
}

