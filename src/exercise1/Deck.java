package exercise1;

import java.util.*;

public class Deck {
    Deque<Card> cards;

    public Deck() {
        cards = new LinkedList<Card>();
        for (Color color : Color.values()) {
            for (Value value : Value.values()) {
                cards.add(new Card(color, value));
            }
        }
    }

    public int getDeckSize() {
        return cards.size();
    }

    public void getAllElements(){
        for (Card card : cards) {
            System.out.println("\t" + card);
        }
    }

    public void shuffleCards(){
        Collections.shuffle((List)cards);
    }

    public Card dealCard() {
        cardToBeRemoved();
        return cards.pollFirst();
    }

    private void cardToBeRemoved() {
        System.out.println(cards.peekFirst());
    }
}
