import java.util.List;
import java.util.ArrayList;
// P.David Gauvreau
//Period 1
// 3-24-2022
/**
 * The ElevensBoard class represents the board in a game of Elevens.
 */
public class ElevensBoard extends Board {

	/**
	 * The size (number of cards) on the board.
	 */
	private static final int BOARD_SIZE = 9;

	/**
	 * The ranks of the cards for this game to be sent to the deck.
	 */
	private static final String[] RANKS =
		{"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

	/**
	 * The suits of the cards for this game to be sent to the deck.
	 */
	private static final String[] SUITS =
		{"spades", "hearts", "diamonds", "clubs"};

	/**
	 * The values of the cards for this game to be sent to the deck.
	 */
	private static final int[] POINT_VALUES =
		{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0};


	/**
	 * The cards on this board.
	 */
	//private Card[] cards;

	/**
	 * The deck of cards being used to play the current game.
	 */
	//private Deck deck;

	/**
	 * Flag used to control debugging print statements.
	 */
	private static final boolean I_AM_DEBUGGING = false;


	/**
	 * Creates a new <code>ElevensBoard</code> instance.
	 */
	public ElevensBoard() {
		cards = new Card[BOARD_SIZE];
		deck = new Deck(RANKS, SUITS, POINT_VALUES);
		if (I_AM_DEBUGGING) {
			System.out.println(deck);
			System.out.println("----------");
		}
		dealMyCards();
		System.out.print("Name : David G, Seat: sat in back, Period 1, Date: 3-24-2022 ");
	}

	
	/**
	 * Determines if the selected cards form a valid group for removal.
	 * In Elevens, the legal groups are (1) a pair of non-face cards
	 * whose values add to 11, and (2) a group of three cards consisting of
	 * a jack, a queen, and a king in some order.
	 * @param selectedCards the list of the indices of the selected cards.
	 * @return true if the selected cards form a valid group for removal;
	 *         false otherwise.
	 */
	public boolean isLegal(List<Integer> selectedCards) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		
		if (selectedCards.size() == 3)
		{
			boolean hasJack = false;
			boolean hasQueen = false;
			boolean hasKing = false;
			
			for (Integer card : selectedCards)
			{
				Card atIndex = cardAt(card);
				if (atIndex.rank().equals("king"))
				{
						hasKing = true;
				}
				
				if (atIndex.rank().equals("queen")) 
				{
						hasQueen = true;
				}
				
				if (atIndex.rank().equals("jack"))
				{
					hasJack = true;
				}
			}
			return hasKing == hasQueen == hasJack == true;
		}
		else if (selectedCards.size() == 3)
		{
			int sum = 0;
			for (Integer card: selectedCards)
			{
				Card atIndex = cardAt(card);
				sum += atIndex.pointValue();
			}
			return sum == 11;
		}
		
		return false;
	}

	/**
	 * Determine if there are any legal plays left on the board.
	 * In Elevens, there is a legal play if the board contains
	 * (1) a pair of non-face cards whose values add to 11, or (2) a group
	 * of three cards consisting of a jack, a queen, and a king in some order.
	 * @return true if there is a legal play left on the board;
	 *         false otherwise.
	 */
	public boolean anotherPlayIsPossible() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		boolean legal = false;
		List<Integer> selected = new ArrayList<Integer>();
		
		for (int card1 = 0; card1 < BOARD_SIZE; card1++)
		{
			selected.add(card1);
			for (int card2 = card1 + 1; card2 < BOARD_SIZE; card2++)
			{
				selected.add(card2);
				legal = (containsPairSum11(selected));
				if (legal) break;
				selected.remove(1);
				
			}
			if (legal) break;
			for (int card2 = card1 + 1; card2 < BOARD_SIZE; card2++)
			{
				selected.add(card2);
				for (int card3 = card2 + 1; card3 < BOARD_SIZE; card3++)
				{
					selected.add(card3);
					legal = (containsJQK(selected));
					if (legal) break;
					selected.remove(2);
					
				}
				if (legal) break;
				selected.remove(1);
		
			}
			if (legal) break;
			selected.remove(0);
		}
		return legal;
	}


	/**
	 * Check for an 11-pair in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find an 11-pair.
	 * @return true if the board entries in selectedCards
	 *              contain an 11-pair; false otherwise.
	 */
	private boolean containsPairSum11(List<Integer> selectedCards) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		return (selectedCards.size() == 3 && cardAt(selectedCards.get(0)).pointValue() + cardAt(selectedCards.get(BOARD_SIZE)) + cardAt(selectedCards.get(2)).pointValue() == 11);
	}

	/**
	 * Check for a JQK in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find a JQK group.
	 * @return true if the board entries in selectedCards
	 *              include a jack, a queen, and a king; false otherwise.
	 */
	private boolean containsJQK(List<Integer> selectedCards) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		Card card1 = cardAt(selectedCards.get(0));
		Card card2 = cardAt(selectedCards.get(1));
		Card card3 = cardAt(selectedCards.get(2));
		
		boolean correctSize = (selectedCards.size() == 3);
		boolean allFace = (card1.pointValue() + card2.pointValue() + card3.pointValue() == 0);
		boolean isJQK = (!card1.rank().equals(card2.rank())) && !(card1.rank().equals(card3.rank())) && !(card2.rank().equals(card3.rank()));
		
	return (correctSize && allFace && isJQK);
	}
}
