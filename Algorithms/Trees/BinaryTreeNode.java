package Trees;

public class BinaryTreeNode {
    BinaryTreeNode left;
    BinaryTreeNode right;
    int val;

    public BinaryTreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
    public BinaryTreeNode(){

    }

    public void insert(int val) {
        if (val < this.val) {
            if (this.left == null) {
                this.left = new BinaryTreeNode(val);
            } else {
                this.left.insert(val);
            }
        } else {
            if (this.right == null) {
                this.right = new BinaryTreeNode(val);
            } else {
                this.right.insert(val);
            }
        }
    }

    public void insert(int[] values) {
        for (int ele : values) {
            this.insert(ele);
        }
    }
}
