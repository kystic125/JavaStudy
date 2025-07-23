package collection.compare.test.MyTest;

public class Card implements Comparable<Card> {
    int num;
    String suit;

    public Card(int num, String suit) {
        this.num = num;
        this.suit = suit;
    }

    public int getNum() {
        return num;
    }

    public String getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return num + "(" + suit + ")";
    }

    @Override
    public int compareTo(Card o) {
        int numCompare = Integer.compare(this.num, o.num);
        if (numCompare != 0) return numCompare;

        return suitPriority(this.suit) - suitPriority(o.suit);
    }

    private int suitPriority(String suit) {
        return switch (suit) {
            case "♠" -> 1;
            case "♥" -> 2;
            case "◆" -> 3;
            case "♣" -> 4;
            default -> 5;
        };
    }
}
