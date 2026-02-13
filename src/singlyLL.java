class Node {
    int data;
    Node next;
    Node(int new_data) {
        this.data = new_data;
        this.next = null;
    }
}
public class singlyLL {
    public static void main(String[]args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        // printing list
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }

    }


}