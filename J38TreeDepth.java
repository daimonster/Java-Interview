/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class Solution {
    public int TreeDepth(TreeNode root) {
        if(root == null) return 0;
        int left = this.TreeDepth(root.left);
        int right = this.TreeDepth(root.right);
        return left > right ? (++left) : (++right);
    }
}