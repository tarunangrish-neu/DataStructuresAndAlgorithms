package Queue;

import java.util.Iterator;
public class QueueUsingLL<Item> implements Iterable<Item> {
    private Node first; //link to least recently added node
    private Node last; // link to most recently added node
    private int N; // no of items on the queue
    class Node{
        Item item;
        Node next;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public int size(){
        return N;
    }

    public void enqueue(Item item){
        Node oldLast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if(isEmpty()) first = last;
        else oldLast.next = last;
        N++;
    }

    public Item dequeue(){
        Item item = first.item;
        first = first.next;
        if(isEmpty()) last = null;
        N--;
        return item;
    }

    public Iterator<Item> iterator(){
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item>{
        private Node current = first;
        public boolean hasNext(){
            return current!=null;
        }
        public void remove(){}
        public Item next(){
            Item item = current.item;
            current = current.next;
            return item;
        }
    }

    public static void main(String[] args){
        QueueUsingLL queue = new QueueUsingLL();
        queue.enqueue("Tarun");
        queue.enqueue("Angrish");
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
