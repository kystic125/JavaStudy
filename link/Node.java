package collection.link;

public class Node {
    Object item;
    Node next;

    public Node(Object item) {
        this.item = item;
    }

    /* // IDE 생성 toString
    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                ", next=" + next +
                '}';
    }
    */

    // [A -> B -> C] 형태로 출력하기
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node x = this; // 현재 위치 저장 (x01)
        sb.append("[");
        while (x != null) {
            sb.append(x.item);
            if (x.next != null) {
                sb.append("->");
            }
            x = x.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
