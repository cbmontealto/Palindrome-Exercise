
public class Basket{

	int size;
	String name;
	int cookType;
	
	
	Basket[] basket = new Basket[10];
	
	public  int put(int noOfBasket) {
		
		for ( int i = 0; i < basket.length ; ++i) {
				
			if ( basket.length != 0) {
				++i;
				noOfBasket = i;
				break;
			}

		}
		return noOfBasket;
	}
	
	public  int set(int noOfBaskets) {
		
		for ( int i = 0; i < basket.length ; ++i) {
				
			if ( basket.length == 0) {
				++i;
				noOfBaskets = i;
				break;
			}

		}
		return noOfBaskets;
	}

}