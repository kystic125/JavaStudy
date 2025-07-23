package collection.compare.test.MyTest;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Card> hand = new ArrayList<>();

    public void setHand(Deck deck) {
        for (int i = 0; i < 5; i++) {
            hand.add(deck.getCard());
        }
        sort(hand);
    }

    public int getSum() {
        int sum = 0;
        for (Card card : hand) {
            sum += card.getNum();
        }
        return sum;
    }

    private void sort(List<Card> list) {
        list.sort(null);
    }

    public void showHand() {
        System.out.print(hand);
        System.out.println(", 총 " + getSum() + "점");
    }
}
