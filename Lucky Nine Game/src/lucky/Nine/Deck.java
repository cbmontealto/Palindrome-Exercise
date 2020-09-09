package lucky.Nine;

import lucky.Nine.TalkingCard.Rank;
import lucky.Nine.TalkingCard.Suit;
import java.util.Random;

public class Deck extends Hand{ // try to change it to two dimensional array

	Random random = new Random();
	
	public void populate() {
		for (Suit suit : Suit.values()) { //enum Suit
			for (Rank rank : Rank.values()) {
				Card card = new Card(rank, suit);
				card.flipcard();
				this.add(card);
			}
		}
	}
	
	public void shuffle() {
		for (int i = cards.size() -1; i > 0; i--) {
			int pick = random.nextInt(i);
			Card randCard = cards.get(pick);
			Card lastCard = cards.get(i);
			cards.set(i, randCard);
			cards.set(pick, lastCard);
		}
	}
	
	public void deal(Hand[] hands, int perHand) {
		for (int i = 0; i < perHand; i++) {
			for (int j = 0; j < hands.length; j++) {
				this.give(cards.get(0), hands[j]);
			}
		}
	}
	
	public void deal(Hand hand, int perHand) {
		for (int i = 0; i < perHand; i++) {
			this.give(cards.get(0), hand);
		}
	}
	
	public void flipCard(Card card) {
		card.flipcard();
	}
	
}
