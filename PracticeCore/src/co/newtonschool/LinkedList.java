package co.newtonschool;

public class LinkedList {
	Node head = null;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}

		Node() {
			// default Constructor
		}
	}

	public static void add(int data) {
		// adds note at the end of the linkedlist
//		Node n = new Node(data);
		// if this node is 1st node then its head node
//		if (head = null) {
//			head = n;
//		}
//		// not the 1st element. 2nd or more
//		else {
//			Node curr = head;
//			while (curr.next != null) {
//				curr = curr.next;
//			}
//			curr.next = n;
//		}
	}

	public static void remove() {
		// removes the 1st element of the linkedlist
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
