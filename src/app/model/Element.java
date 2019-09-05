package app.model;

public class Element<E> {

	private E value;

	private Element<E> next;

	public Element(E value) {
		this.value = value;
	}

	public E getValue() {
		return value;
	}

	public void setValue(E value) {
		this.value = value;
	}

	public Element<E> getNext() {
		return next;
	}

	public void setNext(Element<E> next) {
		this.next = next;
	}

}