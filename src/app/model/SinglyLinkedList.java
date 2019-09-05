package app.model;

public class SinglyLinkedList<E extends Number> {

	private Element<E> first;

	public Element<E> getFirst() {
		return first;
	}

	public void setFirst(Element<E> first) {
		this.first = first;
	}
}
