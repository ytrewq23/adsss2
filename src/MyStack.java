import java.util.Iterator;

public class MyStack<T> {
    //MyArrayList
    private MyArrayList<T> stack = new MyArrayList<>();
    //my constructor
    public MyStack(){
    }

    // The top element of the stack
    public T top(){
        return stack.get(stack.size() - 1);
    }

    // Gets top element of the stack and removes it
    public T pop(){
        T item = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        return item;
    }

    // Adds elements to the top of the stack
    public void push(T item){
        stack.add(item);
    }

    // Removes all elements from the stack
    public void clear(){
        stack.clear();
    }
}
