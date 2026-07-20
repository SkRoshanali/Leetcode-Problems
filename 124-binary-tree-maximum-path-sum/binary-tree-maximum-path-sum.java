/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int lol;
    public int height(TreeNode root){
        if(root == null){
            return 0;
        }
        int ltree = Math.max(height(root.left),0);
        int rtree = Math.max(height(root.right),0);
        int curr = root.val + ltree + rtree;
        lol = Math.max(lol,curr);
        return root.val+ Math.max(ltree,rtree);
    }
    public int maxPathSum(TreeNode root) {
        lol = Integer.MIN_VALUE;
        height(root);
        return lol;
    }
}