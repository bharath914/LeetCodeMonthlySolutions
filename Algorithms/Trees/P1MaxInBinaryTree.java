package Trees;


import java.util.LinkedList;
import java.util.Queue;

/**
 * This problem is about finding the maximum element in binary tree.
 *1.Recursive
 *2.Iterative
 */
public class P1MaxInBinaryTree {
    public static int maxInBinaryTree(BinaryTreeNode root) {

        int maxValue = Integer.MIN_VALUE;
        if (root != null) {
            System.out.println("Current value is .......... " + root.val);
            int leftMax = maxInBinaryTree(root.left);
            int rightMax = maxInBinaryTree(root.right);
            maxValue = Math.max(leftMax, rightMax);
            maxValue = Math.max(maxValue, root.val);
        }
        return maxValue;
    }

    public static int maxInBinaryTreeNonRecursive(BinaryTreeNode root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int max = Integer.MIN_VALUE;
        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            BinaryTreeNode tmp = q.poll();
            max = Math.max(max, tmp.val);
            if (tmp.left != null) q.offer(tmp.left);
            if (tmp.right != null) q.offer(tmp.right);
        }
        return max;
    }

    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(1);
        root.insert(new int[]{6, 2, 3, 4,});
        System.out.println(maxInBinaryTree(root));
        System.out.println(maxInBinaryTreeNonRecursive(root));
    }
}
