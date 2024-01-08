package solutions.easy;

import util.TreeNode;

public class Task938 {

    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null)
            return 0;
        int val = 0;
        if (root.val >= low && root.val <= high)
            val = root.val;
        return val + rangeSumBST(root.right, low, high) + rangeSumBST(root.left, low, high);
    }
}
