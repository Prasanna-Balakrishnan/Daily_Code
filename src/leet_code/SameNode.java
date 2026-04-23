package leet_code;

class TreeNodes {
    int val;
    TreeNodes left, right;

    TreeNodes(int val) {
        this.val = val;
    }

    TreeNodes(int val, TreeNodes left, TreeNodes right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
class SolutionNode {
    public boolean isSameTree(TreeNodes p, TreeNodes q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
public class SameNode {
    public static void main(String[] args) {
        TreeNodes t1 = new TreeNodes(1,
                new TreeNodes(2),
                new TreeNodes(3));

        TreeNodes t2 = new TreeNodes(1,
                new TreeNodes(2),
                new TreeNodes(3)
        );
        SolutionNode obj = new SolutionNode();
        System.out.println(obj.isSameTree(t1, t2));
    }
}
