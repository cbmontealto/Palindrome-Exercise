package lucky.Nine;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String answer;
		do {
		System.out.println("Welcome to Lucky Nine Game!" + "\n");
		
		//Deck
		Deck deck1 = new Deck();
		deck1.populate();
		deck1.shuffle();
		
		//Playing Hand
		Hand player1, computer;
		player1 = new Hand();
		computer = new Hand();
		Hand[] hands = {player1};
		
		//Deal cards to player hand
		deck1.deal(hands, 3);
		
		//Deal cards to dealer
		deck1.deal(computer, 2);
		
		//Show the players hand
		for (int i = 0; i < hands.length; i++) {
			hands[i].flipCards();
			System.out.println("Dealer's card: \n" + hands[i].showHand());
		}
		
		//Show the dealer's card
		//computer.cards.get(0).flipcard();
		System.out.println("Player's card: \n" + computer.showHand());
		
		System.out.println("Play again? Yes or No \n if Yes press y if no press n");
		answer  = scan.next();
		
		}
		while (answer.equals("y"));
		
	}

}
