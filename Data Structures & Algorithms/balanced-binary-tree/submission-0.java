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
    boolean isBalanced=true;
    private int find(TreeNode root){
        if(root==null){
            return 0;
        }
        int a = find(root.left);
        int b = find(root.right);
        if(Math.abs(a-b)>1){
            isBalanced=false;
            return 0;
        }
        return 1+Math.max(a,b);
    }
    public boolean isBalanced(TreeNode root) {
        find(root);
        return isBalanced;
    }
}
