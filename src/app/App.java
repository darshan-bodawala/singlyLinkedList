package app;

import java.util.Scanner;

import app.model.SinglyLinkedList;
import app.service.ISLLService;
import app.service.impl.SLLServiceImpl;

public class App {

	public static void main(String[] args) {
		ISLLService<Integer> sllServiceImpl = new SLLServiceImpl<>();
		SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
		try (Scanner scanner = new Scanner(System.in)) {
			String input = "";
			int operation = 0;
			loop: while (true) {
				printOptions();
				input = scanner.next();
				if (input.chars().allMatch( Character::isDigit )) {
					operation = Integer.parseInt(input);
				} else {
					System.out.println("Please enter the value from 1 to 5.");
					continue;
				}
				switch (operation) {
				case 1:
					System.out.println("Please enter the value which you want to append: ");
					int value = scanner.nextInt();
					sllServiceImpl.insertAtLast(sll, value);
					break;
				case 2:
					sllServiceImpl.removeFromLast(sll);
					break;
				case 3:
					System.out.println("Please enter the target value: ");
					int target = scanner.nextInt();
					sllServiceImpl.removeGreaterThan(sll, target);
					break;
				case 4:
					sllServiceImpl.printList(sll);
					break;
				case 5:
					break loop;
				default:
					System.out.println("Please enter the value from 1 to 5.");
					break;
				}
			}
		}
	}

	private static void printOptions() {
		System.out.println("Please select an operation (i.e. enter the number from 1 to 5): ");
		System.out.println("1. Append an element to the list");
		System.out.println("2. Remove an element from last");
		System.out.println("3. Remove all element in the linkedlist that is great than a target value");
		System.out.println("4. Print the list");
		System.out.println("5. Exit");
	}
}
