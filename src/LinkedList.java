/**
 * Created by Linus&Elias on 2018-03-19.
 */
public class LinkedList {
    Node first;

    public LinkedList() {
        this.first = null;
    }

    public void addFirst(String data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = first;
        first = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        Node last = first;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }



    private class Node {
        Node next;
        String data;
    }

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.addFirst("test");
    }
}