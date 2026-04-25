package leet_code;
class Tree {
    int val;
    Tree left, right;

    Tree(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}
public class PathSum {

    public static boolean hasPathSum(Tree root, int targetSum) {
        if (root == null) return false;
        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }
        return hasPathSum(root.left, targetSum - root.val) ||
               hasPathSum(root.right, targetSum - root.val);
    }

    public static void main(String[] args) {
        Tree root = new Tree(5);
        root.left = new Tree(4);
        root.right = new Tree(8);

        root.left.left = new Tree(11);
        root.left.left.left = new Tree(7);
        root.left.left.right = new Tree(2);

        root.right.left = new Tree(13);
        root.right.right = new Tree(4);
        root.right.right.right = new Tree(1);

        int targetSum = 22;

        boolean result = hasPathSum(root, targetSum);
        System.out.println(result); // true
    }}