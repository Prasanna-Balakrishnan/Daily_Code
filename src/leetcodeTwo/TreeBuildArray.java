package leetcodeTwo;

public class TreeBuildArray {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return build(nums, 0, nums.length - 1);
    }

    public TreeNode build(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(nums[mid]);

        root.left = build(nums, start, mid - 1);
        root.right = build(nums, mid + 1, end);

        return root;
    }

    public static void main(String[] args) {
        TreeBuildArray obj = new TreeBuildArray();

        int[] nums = {-10, -3, 0, 5, 9};
        TreeNode root = obj.sortedArrayToBST(nums);

        System.out.println("Root: " + root.val);
    }
}