package dominion.maven;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import junit.framework.TestCase;

public class LaboratoryTest extends TestCase {


	public static HashMap<Card, Integer> gameBoard = new HashMap<Card, Integer>();	
	List<Card> cards =new ArrayList<Card>(Card.createCards());
	
	Player p = new Player(null, "Thor");
	Player j = new Player(null, "Jay");
	GameState game = new GameState(cards); 
	
	public void test() {
		game.addPlayer(p);
		game.addPlayer(j);
		game.initializeGame();
		Card temp = Card.getCard(cards, Card.CardName.laboratory);

	}


}