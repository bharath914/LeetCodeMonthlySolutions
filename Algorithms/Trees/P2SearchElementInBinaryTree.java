package Trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * searching an element in binary tree
 * with & without recursion
 */
public class P2SearchElementInBinaryTree {
    public static boolean findInBT(BinaryTreeNode root, int val) {
        if (root == null) return false;
        if (root.val == val) return true;
        return findInBT(root.left, val) || findInBT(root.right, val);
    }

    public static boolean findInBTNonRecursive(BinaryTreeNode root, int val) {
        if (root == null) return false;
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            BinaryTreeNode curr = queue.poll();
            if (curr.val == val) return true;
            if (curr.left != null) queue.offer(curr.left);
            if (curr.right != null) queue.offer(curr.right);
        }
        return false;
    }

    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode();
        root.insert(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 10});
        System.out.println(findInBT(root, 10));
        System.out.println(findInBTNonRecursive(root, 10));
        System.out.println(findInBT(root, 12));
        System.out.println(findInBTNonRecursive(root, 12));
    }
}
