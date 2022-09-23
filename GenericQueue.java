package exercise24_5;

import java.util.LinkedList;

@SuppressWarnings("serial")
public class GenericQueue<T> extends LinkedList<T> {
private LinkedList<T> Q;
	public static void main(String[] args) {
		GenericQueue<Integer> q = new GenericQueue<>();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());

	}
	public GenericQueue() {
		Q = new LinkedList<>();
	}
public void enqueue(T data) {
	Q.addFirst(data);
}
public T dequeue() {
	return Q.removeLast();
}
}
