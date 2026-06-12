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
    int max=0;
    private int findDiameter(TreeNode root){
        if(root==null){
            return 0;
        }
        int a = findDiameter(root.left);
        int b = findDiameter(root.right);
        max=Math.max(a+b, max);

        return 1+Math.max(a,b);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        findDiameter(root);
        return max;
    }
}
