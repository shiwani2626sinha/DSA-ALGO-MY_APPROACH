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
    public boolean check(TreeNode left, TreeNode right)
    {
        if(left==null && right==null)return true;
        if(left!=null && right==null) return false;
        if(right!=null && left==null) return false;
        
        if(left.val == right.val)
        {
            Boolean temp1=false, temp2=false;
            temp1= check(left.left,right.right);
            temp2 = check(left.right,right.left);
            return temp1&&temp2;
        }
        else return false;
    }
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        if(root.left == null && root.right == null) return true;
        if(root.left!=null && root.right == null) return false;
        if(root.right!=null && root.left == null) return false;
        else{
            Boolean res = check(root.left,root.right);
            return res;
        }
    }
}
