public class MyMinHeap<T extends Comparable<T>> {
    //MyArrayList
    MyArrayList<T> heap = new MyArrayList<>();

    //My constructor
    public MyMinHeap(){
    }
    // return the size
    public int size(){
        return heap.size();
    }


    // all elements will be deleted from heap
    public void clear(){
        heap.clear();
    }

    //1st element get
    public T getMin(){
        return heap.getFirst();
    }


    // Gets minimum and swaps with last element and removes last element
    public T extractMin(){
        T min = heap.getFirst();
        swap(0, heap.size()-1);
        heap.removeLast();
        heapify(0);
        return min;
    }

    // new item will insert at the end of heap
    public void insert(T item){
        heap.add(item);
        int i = heap.size() - 1;
        heapify(i);
    }

    // heapify function to maintain the heap functions after deletion or insertion
    private void heapify(int i){
        int left = leftChildOf(i);
        int right = rightChildOf(i);
        int minimum = i;
        if (left < heap.size() && heap.get(left).compareTo(heap.get(minimum)) < 0){
            minimum = left;
        }
        if (right < heap.size() && heap.get(right).compareTo(heap.get(minimum)) < 0){
            minimum = right;
        }
        if (minimum != i){
            swap(i, minimum);
            heapify(minimum);
        }
    }

    // traverse function to print the heap
    private void traverse(int i){
        if (i < heap.size()){
            System.out.println(heap.get(i));
            traverse(leftChildOf(i));
            traverse(rightChildOf(i));
        }
    }

    //left child
    public int leftChildOf(int i){
        return 2 * i;
    }
    //right child
    public int rightChildOf(int i){
        return 2 * i + 1;
    }
    // Returns parent
    public int parentOf(int i){
        return i / 2;
    }


    // swapping of two elements
    private void swap(int i, int j) {
        T temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }
}