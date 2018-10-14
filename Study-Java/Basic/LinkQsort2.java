import java.util.*;

class Node {
	int data; 
	Node nxt;
    Node(int data) { this.data = data; this.nxt = null; }
    Node(int data, Node nxt) { this.data = data; this.nxt = nxt; }
}

public class LinkQsort2 {
	static void printList(Node lst) {
		if(lst == null) return;
		else { System.out.print(lst.data + " ");
		printList(lst.nxt); 
		}
}
	
	static List<Node> removeHead(Node lst) { // pair is expressed as List
    // Remove the head node and return head and rest list
    // But the pair of head and rest is represented as a List, tuple.
		List<Node> tuple = new ArrayList<Node> (); // tuple is an empty list
		if (lst == null)
			return tuple;
		Node rest = lst.nxt;
        lst.nxt = null;
        Node head = lst;
        tuple.add(head);
        tuple.add(rest);
        return tuple; // [head, rest]
	}
	
	static Node insertNode(Node lst, Node node) {
		if(node == null) return lst;
		else { node.nxt = lst; return node; }
	}

	static Node concatLink(Node lst1, Node lst2) {
		if(lst1 == null) return lst2;
		Node last = lst1;
		while(last.nxt != null)		
			last = last.nxt; // find the last node of lst1
		last.nxt = lst2; // link the last node to lst2
		return lst1;
		}

	static Node quickSortLink(Node lst) {
		if (lst == null) return null;
		Node lesser = null;
		Node greater = null;
		List<Node> tuple = removeHead(lst);
		Node pivot = tuple.get(0);
		Node rest = tuple.get(1);
		while (rest != null) {
			tuple = removeHead(rest);
			Node hd = tuple.get(0);
			rest = tuple.get(1);
			if (hd.data >= pivot.data)
				greater = insertNode(greater, hd);
			else
				lesser = insertNode(lesser, hd);
		}
		lesser = quickSortLink(lesser);
		greater = quickSortLink(greater);
		return concatLink(concatLink(lesser, pivot), greater);
		}

	public static void main(String[] argv) {
		int[] dataList = {3,2,4,6,1,5,7,8,2,9,5};
		Node lst = null; // An empty linked list
		System.out.print("dataList : ");
		for(int i : dataList) {
			System.out.print(i + " "); // print dataList
            // create a node and insert it into lst
			lst = insertNode(lst, new Node(i));
		}
		System.out.print("\nThe Result of Linked List Costructed\nlst : ");
		printList(lst); // check the linked list
		lst = quickSortLink(lst);
		System.out.println("\nThe result of quick sort : ");
		printList(lst);
		System.out.println();
	}
}