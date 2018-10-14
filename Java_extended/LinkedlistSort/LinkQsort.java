package java_extend._HW2_2;

import java.util.*;

class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data= data;
        this.next = null;
    }
    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public static void PrintNode(Node list) {
        if (list == null) return;
        else {
            System.out.print(list.data + " ");
            PrintNode(list.next);
        }
    }

}


public class LinkQsort {

    public static Node addlist(Node lst, Node node) {
        if(lst == null) return node;
        else {
            node.next = lst;
            return node;
        }
    }

    public static List<Node> head(Node list) {
        List<Node> tuple = new ArrayList<Node>();
        if (list == null)
            return tuple;
        Node rest = list.next;
        list.next = null;
        Node head = list;
        tuple.add(head);
        tuple.add(rest);
        return tuple;
    }

    public static Node concatnation(Node list1, Node list2) {
        if(list1 == null)
            return list2;
        Node node = list1;
        while(node.next != null)
            node = node.next;
        node.next = list2;
        return list1;
    }

    public static Node qsortlist(Node list) {
        if (list == null)
            return null;
        Node lesser = null;
        Node greater = null;
        List<Node> tuple = head(list);
        Node pivot = tuple.get(0); // head
        Node rest = tuple.get(1); // rest
        while (rest != null) {
            tuple = head(rest);
            Node head = tuple.get(0);
            rest = tuple.get(1);
            if(head.data >= pivot.data)
                greater = addlist(greater, head);
            else
                lesser = addlist(lesser, head);
        }
        lesser = qsortlist(lesser);
        greater = qsortlist(greater);
        return concatnation(concatnation(lesser, pivot), greater);
    }

    public static void main(String[] args) {
        Random random = new Random();
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        node1.next = node2;
        node1.next.next = node3;

        Node.PrintNode(node1); // 1 2 3
        System.out.println();
        Node.PrintNode(node1.next.next); // 3
        System.out.println();

        Node list = null;

        int n = random.nextInt(15) + 5;

        for(int i=0; i<n; i++) {
            int x = random.nextInt(15) + 5;
            list = addlist(list, new Node(x));
        }

        System.out.print("Input : ");
        Node.PrintNode(list);
        System.out.println();
        System.out.print("Sort : ");
        list = qsortlist(list);
        Node.PrintNode(list);
    }
}
