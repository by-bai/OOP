public class InterleaveTest {
    public static void main(String[] args) {

        Node prev = null;
        Node head = null;
        for (int i = 1; i <= 10; i++) {
            head = new Node(i);
            head.setNext(prev);
            prev = head;
        }

        LinkedListUtility.print(head);
        LinkedListUtility.interleave(head);
        System.out.println("Testing interleave");
        System.out.println("Expected: ");
        LinkedListUtility.print(head);


    }
}
