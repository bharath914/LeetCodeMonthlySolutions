package Trees;

import java.util.Stack;

public class P6FindHeightOfBinaryTree {
    public static int maxDepth(BinaryTreeNode root) {
        if (root == null) return 0;
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return (leftDepth > rightDepth) ? leftDepth + 1 : rightDepth + 1;
    }

    public static int maxDepthIterative(BinaryTreeNode root) {
        if (root == null) return 0;
        Stack<BinaryTreeNode> stack = new Stack<>();
        stack.push(root);
        int maxDepth = 0;
        BinaryTreeNode prev = null;
        while (!stack.isEmpty()) {
            BinaryTreeNode curr = stack.peek();
            if (prev == null || prev.left == curr || prev.right == curr) {
                if (curr.left != null) stack.push(curr.left);
                else if (curr.right != null) stack.push(curr.right);
            } else if (curr.left == prev) {
                if (curr.right != null) stack.push(curr.right);
            } else stack.pop();
            prev = curr;
            if (stack.size() > maxDepth) maxDepth = stack.size();
        }
        return maxDepth;
    }

    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(1);
        root.insert(new int[]{2, 3, 4, 5, 6, 7});
        System.out.println(maxDepth(root));
        System.out.println(maxDepthIterative(root));
    }
}
