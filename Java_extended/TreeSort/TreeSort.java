package java_extend;

class Tree {
    int data; Tree left; Tree right;
    Tree(int data) { this(data, null, null); }
    Tree(int data, Tree left, Tree right) {
        this.data = data; this.left = left; this.right = right; }
    public String toString () { // in-order traversing
        if (this == null) return "";
        String str = ((this.left == null) ? "" : this.left.toString())
                + " " + this.data + " "
                + ((this.right == null) ? "" : this.right.toString());
        return str;
    }
}
public class TreeSort {
    public static Tree insert(Tree node, Tree tree) {
        if (tree == null) {
            return node;
        }
        if (node.data <  tree.data) {
            tree.left = insert(node, tree.left);
        } else {
            tree.right = insert(node, tree.right);
        }
        return tree;
    }
    public static void main (String argv[]) {
        int[] numbers = {3,2,4,6,1,5,7,8,2,9,5};
        Tree tree1 = null;
        for(int i : numbers)
            tree1 = insert(new Tree(i), tree1);
        System.out.println(tree1);
    }
}

