package collection.compare.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards = new ArrayList<>();

    public Deck() {
        initCard();
        shuffle();
    }

    private void initCard() {
        for (int i = 1; i <= 13; i++) {
//            cards.add(new Card(i, Suit.SPADE));
//            cards.add(new Card(i, Suit.HEART));
//            cards.add(new Card(i, Suit.DIAMOND));
//            cards.add(new Card(i, Suit.CLUB)); // 위 내용을 반복문으로 줄일 수 있음
            for (Suit suit : Suit.values()) {
                cards.add(new Card(i, suit));
            }
        }
    }

    private void shuffle() {
        Collections.shuffle(cards);
    }

    public Card drawCard() {
//        return cards.remove(0);
        return cards.removeFirst();
    }
}
