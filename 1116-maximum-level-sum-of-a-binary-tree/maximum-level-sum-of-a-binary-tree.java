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
    Queue<TreeNode> q=new LinkedList<>();        
    public int maxLevelSum(TreeNode root) {
        int maxsum=Integer.MIN_VALUE;
        int maxlevel=0;
        int level=1;
        if(root!=null) q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            int sum=0;
            for(int i=0;i<size;i++){
                TreeNode cur=q.poll();
                sum+=cur.val;
                if(cur.left!=null) q.add(cur.left);
                if(cur.right!=null) q.add(cur.right);
            }
            if(maxsum<sum){
               maxsum=sum;
               maxlevel=level;
            }
            level++;
        }
        return maxlevel;
    }
}