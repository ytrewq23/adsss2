import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList<>();

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

    }
}