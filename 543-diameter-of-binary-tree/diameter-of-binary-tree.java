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
    private int lol=0;
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int ltree = height(root.left);
        int rtree = height(root.right);
        lol = Math.max(lol,ltree+rtree);
        return 1 + Math.max(ltree,rtree);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        lol = 0;
        height(root);
        return lol;
    }
}