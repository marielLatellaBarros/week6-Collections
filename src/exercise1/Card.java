package exercise1;

public class Card {
    Color color;
    Value value;

    public Card(Color color, Value value) {
        this.color = color;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Card{" + color +
                ", " + value +
                '}';
    }
}
