package exercise1;

public class DeckTestApp {
    public static void main(String[] args) {


        Deck myDeck = new Deck();

        System.out.println("The size of the deck is: " + myDeck.getDeckSize());
        System.out.println(myDeck.showDeck());
        Card chosenCard = myDeck.dealCard();
        System.out.println("The chosen card is: " + chosenCard);
        System.out.println("The size of the deck after taking a card  is: " + myDeck.getDeckSize());

    }
}
