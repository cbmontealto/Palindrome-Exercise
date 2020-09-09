package lucky.Nine;

public class TalkingCard {

	public enum Suit{
		DIAMONDS("Diamond"), HEARTS("Heart"),
		SPADES("Spades"), FLOWERS("Flowers");
		
	//enum must be final, it should be constant and not allowed to change during runtime
	private final String suitCard;
	
	//constructor
	private Suit(String suitCard) {
		this.suitCard = suitCard;
	}
	
	public String printSuit() {
		return suitCard;
	}
	
	}
	
	public enum Rank{
		/*ACE(1), TWO(2), THREE(3), FOUR(4), FIVE(5),
		SIX(6), SEVEN(7),	EIGTH(8), NINE(9), TEN(10),
		JACK(10), QUEEN(10), KING(10);*/
		
		ACE("Ace",1), TWO("2",2), THREE("3",3), FOUR("4",4), FIVE("5",5),
		SIX("6",6), SEVEN("7",7),	EIGTH("8",8), NINE("9",9), TEN("10",10),
		JACK("Jack",10), QUEEN("Queen",10), KING("King",10);
		
	//enum must be final, it should be constant and not allowed to change during runtime
	private final int rankValue;
	private final String  rankString;	
	
	//constructor
	private Rank(String rankString, int rankValue) {
		this.rankValue = rankValue;
		this.rankString = rankString;
	}
		
	public int getRank() {
		return rankValue;
	}
	
	public String printRank() {
		return rankString;
	}
	
	}
	
	public void talk() {

	}
	
	
	
	
}