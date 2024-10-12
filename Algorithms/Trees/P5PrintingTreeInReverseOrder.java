package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class P5PrintingTreeInReverseOrder {
    public static void levelOrderTraversal(BinaryTreeNode root) {
        if (root == null) return;
        Stack<BinaryTreeNode> stack = new Stack<>();
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            BinaryTreeNode temp = queue.poll();
            if (temp.left != null) queue.add(temp.left);
            if (temp.right != null) queue.add(temp.right);
            stack.push(temp);
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop().val + " ");
        }
    }

    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(1);
        root.insert(new int[]{2, 3, 4, 5, 6, 7});
        levelOrderTraversal(root);
    }
}
