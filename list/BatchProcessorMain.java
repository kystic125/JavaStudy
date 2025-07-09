package collection.list;

public class BatchProcessorMain {
    public static void main(String[] args) {
        // 의존성 주입 --> 아래 ArrayList <-> LinkedList 변환 시 BatchProcessor 코드는 바꿀 필요가 전혀 없음
        // MyArrayList를 사용하는 경우
            MyArrayList<Integer> list = new MyArrayList<>();

        BatchProcessor processor = new BatchProcessor(list);
        processor.logic(50_000);

        // MyLinkedList를 사용하는 경우
        MyLinkedList<Integer> list2 = new MyLinkedList<>();

        BatchProcessor processor2 = new BatchProcessor(list2);
        processor2.logic(50_000);
    }
}
