import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
            MyLinkedList myLinkedList = new MyLinkedList<>() {
                @Override
                public void set(int index, Object item) {

                }

                //LinkedList functions
                @Override
                public void add(int index, Object element) {

                }

                @Override
                public void addFirst(Object item) {

                }

                @Override
                public void addLast(Object item) {

                }

                @Override
                public Object get(int index) {
                    return null;
                }

                @Override
                public Object getFirst() {
                    return null;
                }

                @Override
                public Object getLast() {
                    return null;
                }

                @Override
                public void remove(int index) {

                }

                @Override
                public void removeFirst() {

                }

                @Override
                public void removeLast() {

                }

                @Override
                public void sort() {

                }

                @Override
                public int indexOf(Object object) {
                    return 0;
                }

                @Override
                public int lastIndexOf(Object object) {
                    return 0;
                }

                @Override
                public boolean exists(Object object) {
                    return false;
                }

                @Override
                public Object[] toArray() {
                    return new Object[0];
                }

                @Override
                public boolean isEmpty() {
                    return false;
                }

                @Override
                public boolean contains(Object element) {
                    return false;
                }

                @Override
                public Iterator<Object> iterator() {
                    return null;
                }
            };

            myLinkedList.addElement(3);
            myLinkedList.addElement(2);
            myLinkedList.addElement(0);
            myLinkedList.addElement(0);
            myLinkedList.addElement(6);
            myLinkedList.addElement(4);


            System.out.println("Value of index 2: " + myLinkedList.getElement(2));
            System.out.println("Current size of a list:" + myLinkedList.getSize());
            System.out.println("Values of index 0 before remove: " + myLinkedList.getElement(0));
            myLinkedList.remove(0);
            System.out.println("Value of index 0 after remove: " + myLinkedList.getElement(0));
            System.out.println("Size of an list: " + myLinkedList.getSize());
            System.out.println("Value of index 1 before remove: " + myLinkedList.getElement(1));
            myLinkedList.remove(1);
            System.out.println("Value of index 1 after remove: " + myLinkedList.getElement(1));
            System.out.println("Current size of a list: " + myLinkedList.getSize());


        // functions with ArrayList
        MyArrayList myArrayList =  new MyArrayList();

        ArrayList arrayList = new ArrayList();

        myArrayList.addElement(11.5);
        myArrayList.addElement(10);
        myArrayList.addElement(9);
        myArrayList.addElement(8.7);
        myArrayList.addElement(7);
        myArrayList.addElement(6);

        System.out.println("Value of second element " + myArrayList.getElement(2));
        myArrayList.addElement(20,3);
        System.out.println("After new adding element of second " + myArrayList.getElement(2));
        System.out.println("Size of myArrayList: " + myArrayList.getSize());
        myArrayList.removeLast(3);
        System.out.println("Size of myArrayList after removing: " + myArrayList.getSize());
        System.out.println("Value of second element  after removing: " + myArrayList.getElement(2));
        myArrayList.clear();
        System.out.println("size after clearing: " + myArrayList.getSize());

        // MyQueue
        MyQueue<Integer> myQueue = new MyQueue<>();

        myQueue.enqueue(10);
        myQueue.enqueue(20);
        myQueue.enqueue(30);

        int dequeuedItem = myQueue.dequeue();
        System.out.println("Dequeued item: " + dequeuedItem);
        System.out.println("Is it empty? " + myQueue.isEmpty());
        System.out.println("Size of the queue: " + myQueue.size());
        myQueue.clear();
        System.out.println("After clearing " + myQueue.isEmpty());

        //MyStack
        MyStack<Integer> stack = new MyStack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Top element: " + stack.top());
        int popped = stack.pop();
        System.out.println("Popped element: " + popped);
        System.out.println("Empty or not " + stack.isEmpty());
        stack.clear();
        System.out.println("After clearing " + stack.isEmpty());

        //MyMinHeap
        MyMinHeap<Integer> minHeap = new MyMinHeap<>();

        minHeap.insert(3);
        minHeap.insert(2);
        minHeap.insert(1);
        minHeap.insert(5);
        minHeap.insert(4);

        System.out.println("Minimum element: " + minHeap.getMin());
        System.out.println("Removed minimum element: " + minHeap.extractMin());
        System.out.println("After 1st element, Minimum element: " + minHeap.getMin());
        minHeap.insert(0);
        System.out.println("After added, Minimum element: " + minHeap.getMin());
    }

}