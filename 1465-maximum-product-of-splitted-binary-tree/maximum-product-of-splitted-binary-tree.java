class Solution {
    long sum=0;
    long max=Integer.MIN_VALUE;
    long MOD=1000000007;
    public long postorder(TreeNode root){
        if(root==null) return 0;
          long left=postorder(root.left);
          long right=postorder(root.right);
          return sum=left+right+root.val;
    }
    public long dfs(TreeNode root){
        if(root==null) return 0;
        long left= dfs(root.left);
        long right=dfs(root.right);
        long tot=left+right+root.val;
        long rem=sum-tot;
       max=Math.max(max,(rem*tot));
       return tot;
    }
    public int maxProduct(TreeNode root) {
        if(root==null) return 0;
        sum=postorder(root);
        dfs(root);
        return (int) (max%MOD);
    }
}