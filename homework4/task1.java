package homework4;

import java.util.LinkedList;
import java.util.Random;
import java.util.Stack;

// Задание 1.
// Создать LinkedList целых чисел (заполнить случайными числами).
// Реализуйте метод, который вернет “перевернутый” список.
public class task1 {
    public static void main(String[] args) {
        int linkedListSize = 10;
        LinkedList<Integer> myLinkList = new LinkedList<Integer>();
        myLinkList = fillLinkedList(myLinkList, linkedListSize);
        revertList(myLinkList);
    }
    public static LinkedList<Integer> fillLinkedList(LinkedList<Integer> list, int size) {
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            list.add(rand.nextInt(100));
        }
        System.out.print("Filled LinkedList -> ");
        System.out.println(list);
        return list;
    }
    public static LinkedList<Integer> revertList(LinkedList<Integer> list) {
        Stack<Integer> tempStack = new Stack<Integer>();
        int sizeList = list.size();
        for (int i = 0; i < sizeList; i++) {
            tempStack.push(list.get(i));
        }
        list.removeAll(tempStack);
        // System.out.println(tempStack);
        int sizeStack = tempStack.size();
        for (int i = 0; i < sizeStack; i++) {
            list.add(tempStack.pop());
        }
        System.out.print("Revert LinkedList -> ");
        System.out.print(list);
        return list;
    }
}
