package collection.compare.test;

public class Card implements Comparable<Card> {
    private final int rank; // 카드의 숫자
    private final Suit suit;

    public Card(int rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public int compareTo(Card anotherCard) {
        // 숫자를 먼저 비교하고, 같을 경우 마트 비교
        if (this.rank != anotherCard.rank) {
            return Integer.compare(this.rank, anotherCard.rank);
        } else {
            return this.suit.compareTo(anotherCard.suit);
            // enum은 Enum을 상속 받고 있음
            // -> Enum 클래스는 comparable을 구현하고 있음
            // Enum의 comparable에 가면 ordinary가 구현되어 있음 (enum에 작성한 순서대로 정렬됨)
            // -> Enum에 구현된 ordinary는 final이기 때문에 오버라이딩 불가!
            // 만일 새로 만들거면 compareTo말고 myCompareTo와 같은 다른 메소드를 구현해야 함
        }
    }

    @Override
    public String toString() {
        return rank + "(" + suit.getIcon() + ")";
    }
}
