package leet_code;

class Trees {
    int val;
    Trees left;
    Trees right;

    Trees() {}

    Trees(int val) {
        this.val = val;
    }

    Trees(int val, Trees left, Trees right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class MaxDepth {
    public static int maxDepth(Trees root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }
    public static void main(String[] args) {
        Trees root = new Trees(1);
        root.left = new Trees(2);
        root.right = new Trees(3);
        root.left.left = new Trees(4);
        Solution obj = new Solution();
        int result = maxDepth(root);
        System.out.println("Maximum Depth: " + result);
    }
}