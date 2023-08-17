/*
Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along
the path equals targetSum.
A leaf is a node with no children
*/


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
    public boolean rootToLeafPath(TreeNode root, int targetSum,int sum)
    {
        if(root==null)
        {
            return false;
        }
        if(root.left==null && root.right==null)
        {
            sum=sum+root.val;
            if(sum==targetSum)
            {
                return true;
            }

        }
 return rootToLeafPath(root.left,targetSum,sum+root.val)|| rootToLeafPath(root.right,targetSum,sum+root.val);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
       int sum=0;
       return rootToLeafPath(root,targetSum,sum);
    }

}
