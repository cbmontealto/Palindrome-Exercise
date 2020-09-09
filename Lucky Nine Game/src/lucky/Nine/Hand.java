package lucky.Nine;

import java.util.ArrayList;

public class Hand{

	//let the constructor set the value
	protected ArrayList<Card> cards; 

	//Constructor
	public Hand() {
		cards = new ArrayList<Card>();

	}
	
	public void clear() {
		cards.clear();
	}
	
	public void add(Card card) {
		cards.add(card);
	}
	
	public String showHand() {
		String str = "";
		boolean allShow = true;
		for(Card cards : cards) {
			str += cards.toString() + "\n"; // method from Card class
			if(!cards.isShow) {
				allShow = false;
			}
		}
		if(allShow) {
			str += "Total points is: " + getTotal() + "\n";
		}
		return str;
	}
	
	public boolean give(Card card, Hand otherHand) {
		if(!cards.contains(card)) {
			return false;
		}
		else {
			cards.remove(card);
			otherHand.add(card);
			return true;
		}
	}
	
	//return the total points of a hand
	public int getTotal() {
		int totalPoints = 0;
		boolean hasAce = false;
		//getting total points
		for (int i = 0; i < cards.size(); i++) {
			totalPoints += cards.get(i).getRank();
			//check to see if the card is an Ace
			if(cards.get(i).printRank() == "10" ) {
				hasAce = true;
			}
			else if(cards.get(i).printRank() == "Jack" ) {
				hasAce = true;
			}
			else if(cards.get(i).printRank() == "Queen" ) {
				hasAce = true;
			}
			else if(cards.get(i).printRank() == "King" ) {
				hasAce = true;
			}
			
			if (hasAce && totalPoints >= 9) {
				totalPoints -= 10;
			}
			
			if (totalPoints > 9) {
				totalPoints = 9;
			}
			
		}
		return totalPoints;
	}
	 public void flipCards() {
		 for(Card card : cards) {
			 card.flipcard();
		 }
	 }
}
