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
    public List<Integer> postorderTraversal(TreeNode root) {
        TreeNode curr = root;
        TreeNode temp;
        List<Integer>list = new ArrayList<Integer>();
        Stack<TreeNode>stack = new Stack<>();
        while(curr!=null || !stack.isEmpty()){
            if(curr!=null){stack.push(curr);
            curr = curr.left;}
           else if(curr == null)
            {
                temp = stack.peek().right;
                if(temp!=null)
                {
                    curr=temp;
                }else{
                    temp=stack.pop();
                    list.add(temp.val);
                    while(!stack.isEmpty() && temp==stack.peek().right)
                    {
                        temp=stack.pop();
                        list.add(temp.val);
                    }
                    
                }
            }
        }
        return list;
    }
}
