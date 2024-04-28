public class MyQueue<T extends Comparable<T>> {
    //MyArrayList
    MyArrayList<T> queue = new MyArrayList<>();

    //my constructor
    public MyQueue(){
    }
    //first element from queue
    public T front (){
        return queue.getFirst();
    }

    //last element from queue
    public T back(){
        return queue.getLast();
    }


    //removes 1st element and get it
    public T dequeue(){
        T item = queue.getFirst();
        queue.remove(0);
        return item;
    }

    //enqueue add element
    public void enqueue(T item){
        queue.add(item);
    }

    //checking for empty is queue
    public boolean isEmpty(){
        return queue.size() == 0;
    }

    //the length of queue
    public int size(){
        return queue.size();
    }

    //all elements will be deleted
    public void clear(){
        queue.clear();
    }

}