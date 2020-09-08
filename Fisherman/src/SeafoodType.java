 
public class SeafoodType extends Seafood {

	public SeafoodType(int size, String name, int cookType) {
		super(size, name, cookType);
		// TODO Auto-generated constructor stub
	}

	public String setSeafoodType(String seafoodType) {
		if (name == "Fish") {
			if (size >= 0 && size <= 50) {
				seafoodType = "Anchovy";
			}
			else if (size >= 51 && size <= 200) {
				seafoodType = "Tilapia";
			}
			else if (size >= 201 && size <= 500){
				seafoodType = "Tuna";
			}
			else if (size <= 0 || size >= 500) {
				seafoodType = "Fish is not available.";
			}
		}
		else if (name == "Crustacean") {
			if (size >= 0 && size <= 50) {
				seafoodType = "Shrimp";
			}
			else if (size >= 51 && size <= 200) {
				seafoodType = "Crab";
			}
			else if (size >= 201 && size <= 500){
				seafoodType = "Lobster";
			}
			else if (size <= 0 || size >= 500) {
				seafoodType = "Crustacean is not available.";
			}
		}
		else
		{
			seafoodType = "Seafood is not available.";
		}
		
		return seafoodType;
	}
	
}
