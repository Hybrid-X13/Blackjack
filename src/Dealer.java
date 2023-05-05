import enums.BlackjackRules;

/**
 * @author Hybrid
 * 
 * Contains general data and methods for the dealer
 */
public class Dealer {
    private final Hand hand;

    /**
     * Constructor for creating the dealer
     */
    public Dealer() {
        hand = new Hand();
    }

    /**
     * @return The dealer's hand
     */
    public Hand getHand() {
        return hand;
    }

    /**
     * @return Check whether the player busts or not
     */
    public boolean bust() {
        return hand.getScore() > BlackjackRules.BLACKJACK_VALUE ? true: false;
    }

    /**
     * Adds a card to the dealer's hand when they hit
     * 
     * @param deck The deck object to pull a card from
     */
    public void hit(Deck deck) {
        hand.addCard(deck.dealCard());
    }
}