package homework4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

// Задание 2:
// Создать очередь с помощью LinkedList и реализовать следующие методы:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.
// Вызвать полученные методы и убедиться в их работоспособности.
public class task2 {
    public static void main(String[] args) {
        int queueSize = 10;
        LinkedList<Integer> queue = new LinkedList<Integer>();
        queue = fillLinkedList(queue, queueSize);
        enqueue(queue, 23);
        dequeue(queue);
        first(queue);
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
    public static LinkedList<Integer> enqueue(LinkedList<Integer> list, int value) {
        list.add(value);
        System.out.print("Added last elem -> ");
        System.out.println(list);
        return list;
    }
    public static int dequeue(LinkedList<Integer> list) {
        Queue<Integer> q = new LinkedList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            q.add(list.get(i));
        }
        list.removeAll(q);
        int firstEl = q.poll();
        int qSize = q.size();
        for (int i = 0; i < qSize; i++) {
            list.add(q.poll());
        }
        System.out.printf("First element -> %d\n", firstEl);
        System.out.print("List after removing First El -> ");
        System.out.println(list);
        return firstEl;
    }
    public static int first(LinkedList<Integer> list) {
        int firstEl = list.get(0);
        System.out.printf("First element -> %d\n", firstEl);
        System.out.print("List after getting First El -> ");
        System.out.println(list);
        return firstEl;
    }
}
