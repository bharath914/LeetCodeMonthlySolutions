package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class P3InsertingElementInBinaryTree {
    public void insert(BinaryTreeNode root, int data) {
        if (root == null) {
            root = new BinaryTreeNode(data);
        } else {
            insertHelper(root, data);
        }

    }

    private void insertHelper(BinaryTreeNode root, int data) {
        if (root.left == null) root.left = new BinaryTreeNode(data);
        else insertHelper(root.right, data);
        if (root.right == null) root.right = new BinaryTreeNode(data);
        else insertHelper(root.right, data);
    }

    public BinaryTreeNode insertInBinaryTreeNonRecursive(BinaryTreeNode root, int data) {
        if (root == null) return null;
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            BinaryTreeNode tmp = queue.poll();
            if (tmp != null) {
                if (tmp.left != null) {
                    queue.offer(tmp.left);
                } else {
                    tmp.left = new BinaryTreeNode(data);
                    return root;
                }
                if (tmp.right != null) {
                    queue.offer(tmp.right);
                } else {
                    tmp.right = new BinaryTreeNode(data);
                    return root;
                }
            }

        }
        return root;
    }

    public static void main(String[] args) {

    }
}
