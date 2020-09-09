package lucky.Nine;

public class Card extends TalkingCard{

	//private fields
	private Suit suit;
	private Rank rank;
	public boolean isShow;
	
	//constructor method - first rank to appear + suit
	public Card(Rank rank, Suit suit) {
		this.rank = rank;
		this.suit = suit;
		isShow = false;
	}
	
	//public method to get the method for suit from TalkingCard class
	public String getSuit() {
		return suit.printSuit();
	}
	
	//get rank as string 
	public String printRank() {
		return rank.printRank();
	}
	
	//public method - to get the method for rank from TalkingCard class (from int to string)
	public int getRank() {
		return rank.getRank();
	}
	
	public void flipcard() {
		isShow = !isShow;
	}
	
	
	// method to create the combination of rank and suit
	public String toString() {
		String str = ""; //create a local variable
		if(isShow) {
			str += rank.printRank() + " of " + suit.printSuit();
		}
		else {
			str = "Card is facing down!";
		}
		return str;
	}
	
}
