package collection.compare.test.MyTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    List<Card> deck = new ArrayList<>();

    String shape;
    int num;

    public Deck() {
        String[] suits = {"♠", "♥", "◆", "♣"};
        for (String suit : suits) {
            for (int i = 1; i <= 13; i++) {
                deck.add(new Card(i, suit));
            }
        }
    }

    public void shuffleDeck() {
        Collections.shuffle(deck);
    }

    public Card getCard() {
        return deck.removeLast();
    }


}
