package exercise1;

import java.util.Deque;
import java.util.LinkedList;

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
}
