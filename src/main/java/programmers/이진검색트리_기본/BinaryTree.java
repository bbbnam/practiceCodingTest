package programmers.이진검색트리_기본;

import org.omg.Messaging.SyncScopeHelper;

class Tree{
    class Node {
        int data;
        Node left;
        Node right;
        public Node(int data) {
            this.data = data;
        }
    }
    Node root;
    public void makeTree(int[] a) {
        root = makeTreeRoot(a, 0, a.length-1);
    }

    private Node makeTreeRoot(int[] totalArray, int startIndex, int endIndex) {
        if (startIndex > endIndex) {
            return null;
        }
        int mid = (startIndex + endIndex) / 2;
        Node node = new Node(totalArray[mid]);
        node.left = makeTreeRoot(totalArray, startIndex, mid -1 );
        node.right = makeTreeRoot(totalArray, mid + 1, endIndex);
        return node;
    }
    public void searchBTree(Node n, int find) {
        if (find < n.data) {
            System.out.println("Data is smaller than>> " + n.data);
            searchBTree(n.left, find);
        } else if (find > n.data) {
            System.out.println("Data is bigger than>> "+n.data);
            searchBTree(n.right, find);
        } else {
            System.out.println("Data found!");
        }
    }
}

public class BinaryTree {

    public static void main(String[] args) {
        int [] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        Tree t = new Tree();
        t.makeTree(a);
        t.searchBTree(t.root, 2); //2를 찾는다
    }
}
