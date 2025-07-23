package collection.compare.test.MyTest;

public class CardGameMain {
    public static void main(String[] args) {
        Player p1 = new Player();
        Player p2 = new Player();
        Deck deck = new Deck();

        deck.shuffleDeck();

        p1.setHand(deck);
        p2.setHand(deck);

        System.out.print("플레이어1: ");
        p1.showHand();
        System.out.print("플레이어2: ");
        p2.showHand();

        winner(p1, p2);
    }

    public static void winner(Player p1, Player p2) {
        if (p1.getSum() > p2.getSum()) {
            System.out.println("플레이어1 승리");
        } else if (p1.getSum() == p2.getSum()) {
            System.out.println("무승부");
        } else {
            System.out.println("플레이어2 승리");
        }
    }
}