package java_extend;

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



public class homework {

    public static Node addlist(Node lst, Node data) {
        if(data == null) return lst;
        else { data.next = lst; return data; }
    }

    public static List<Node> head(Node list) {
        List<Node> tuple = new ArrayList<Node> ();
        if (list == null)
            return tuple;
        Node rest = list.next;
        list.next = null;
        Node head = list;
        tuple.add(head);
        tuple.add(rest);
        return tuple;
    }

    public static List<Node> max(Node list) {
        List<Node> tuple = new ArrayList<Node> ();
        if (list == null)
            return tuple;
        if (list.next == null) {
            tuple.add(list);
            tuple.add(null);
            return tuple;
        }
        Node original = list;
        Node prev = list;
        Node mx = list;
        Node rest;
        while(list.next != null) {
            if(list.next.data > mx.data) {
                mx = list.next;
                prev = list;
            }
            list = list.next;
        }

        if(prev == mx) {
            rest = mx.next;
            mx.next = null;
        }
        else if(mx.next == null) {
            prev.next = null;
            rest = original;
        }
        else {
            prev.next = mx.next;
            mx.next = null;
            rest = original;
        }
        tuple.add(mx);
        tuple.add(rest);

        return tuple;
    }

    public static Node sortlist(Node list) {
        if (list == null)
            return null;
        List<Node> tuple = max(list);
        Node x = tuple.get(0);
        Node xs = tuple.get(1);
        Node sort = x;
        while (xs.next != null) {
            List<Node> tuple2 = max(xs);
             x = tuple2.get(0);
             xs = tuple2.get(1);
            sort = addlist(sort, x);
        }
        return sort;

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
        sortlist(list);
        System.out.print("Sort : ");
        Node.PrintNode(list);

    }
}
