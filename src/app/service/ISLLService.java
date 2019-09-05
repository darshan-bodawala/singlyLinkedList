package app.service;

import app.model.SinglyLinkedList;

public interface ISLLService<E extends Number> {
	/**
	 * This method is responsible to append a new element to the list. If the
	 * list is empty, then it will set the new element as the first element of
	 * the list.
	 * 
	 * @param list
	 * @param value
	 */
	public void insertAtLast(SinglyLinkedList<E> list, E value);

	/**
	 * This method is responsible to remove an element from the list. If the
	 * list is empty, then it will simply return.
	 * 
	 * @param list
	 */
	public void removeFromLast(SinglyLinkedList<E> list);

	/**
	 * This method is responsible to remove all element greater than the given
	 * target value. If the list is empty, then it will simply return.
	 * 
	 * @param list
	 * @param target
	 */
	public void removeGreaterThan(SinglyLinkedList<E> list, E target);

	/**
	 * This method will print the existing linkedlist.
	 * 
	 * @param list
	 */
	public void printList(SinglyLinkedList<E> list);
}
