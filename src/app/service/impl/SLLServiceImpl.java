package app.service.impl;

import app.model.Element;
import app.model.SinglyLinkedList;
import app.service.ISLLService;

public class SLLServiceImpl<E extends Number> implements ISLLService<E> {

	@Override
	public void insertAtLast(SinglyLinkedList<E> list, E value) {
		Element<E> newElement = new Element<E>(value);
		if (list.getFirst() == null) {
			list.setFirst(newElement);
		} else {
			Element<E> lastElement = list.getFirst();
			while (lastElement.getNext() != null) {
				lastElement = lastElement.getNext();
			}
			lastElement.setNext(newElement);
		}

	}

	@Override
	public void removeFromLast(SinglyLinkedList<E> list) {
		if (list.getFirst() == null) {
			return;
		} else if (list.getFirst().getNext() == null) {
			list.setFirst(null);
		} else {
			Element<E> lastElement = list.getFirst();
			Element<E> previousElement = list.getFirst();
			while (lastElement.getNext() != null) {
				previousElement = lastElement;
				lastElement = lastElement.getNext();
			}
			previousElement.setNext(null);
		}
	}

	@Override
	public void removeGreaterThan(SinglyLinkedList<E> list, E target) {
		Element<E> crrElement = list.getFirst();
		while (crrElement != null) {
			if (crrElement.getValue().doubleValue() > target.doubleValue()) {
				list.setFirst(crrElement.getNext());
				crrElement = crrElement.getNext();
			} else {
				if (crrElement.getNext().getValue().doubleValue() > target.doubleValue()) {
					crrElement.setNext(crrElement.getNext().getNext());
				} else {
					crrElement = crrElement.getNext();
				}
			}
		}
	}

	@Override
	public void printList(SinglyLinkedList<E> list) {
		Element<E> currNode = list.getFirst();
		System.out.print("Singly LinkedList: [");
		while (currNode != null) {
			System.out.print(currNode.getValue() + " ");
			currNode = currNode.getNext();
		}
		System.out.print("]");
		System.out.println();
	}

}
