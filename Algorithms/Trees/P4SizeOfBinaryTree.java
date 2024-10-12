package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class P4SizeOfBinaryTree {
    public static int size(BinaryTreeNode root) {
        if (root == null) return 0;
        int leftCount = root.left == null ? 0 : size(root.left);
        int rightCount = root.right == null ? 0 : size(root.right);
        return 1 + leftCount + rightCount;
    }

    public static int sizeNonRecursive(BinaryTreeNode root) {
        int count = 0;
        if (root == null) return 0;
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            BinaryTreeNode tmp = queue.poll();
            count++;
            if (tmp.left != null) queue.offer(tmp.left);
            if (tmp.right != null) queue.offer(tmp.right);
        }
        return count;
    }

    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(10);
        root.insert(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        System.out.println(size(root));
        System.out.println(sizeNonRecursive(root));
    }
}
