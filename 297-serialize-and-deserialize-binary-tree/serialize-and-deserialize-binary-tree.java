/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null) return "null";
        StringBuilder sb=new StringBuilder();
        Queue <TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode cur=q.poll();
            if(cur==null) {
                sb.append("null,");
                continue;
            }
            else sb.append(cur.val+",");
            q.offer(cur.left);
            q.offer(cur.right);
        }
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.equals("null")) return null;
        Queue <TreeNode> q=new LinkedList<>();
        String[] d=data.split(",");
        TreeNode root=new TreeNode(Integer.parseInt(d[0]));
        q.offer(root);
        int i=1; 
        while(!q.isEmpty()){
            TreeNode cur=q.poll();
            if(!d[i].equals("null")){
                cur.left=new TreeNode(Integer.parseInt(d[i]));
                q.offer(cur.left);
            }
            i++;
             if(!d[i].equals("null")){
                cur.right=new TreeNode(Integer.parseInt(d[i]));
                q.offer(cur.right);
            }
            i++;
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));