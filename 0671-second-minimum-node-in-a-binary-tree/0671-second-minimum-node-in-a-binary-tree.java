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
    List<Integer> l;
    public int findSecondMinimumValue(TreeNode root) {
        l= new ArrayList<>();
        dfs(root);
        Set<Integer> set=new HashSet<>(l);
        l= new ArrayList<>(set);
        Collections.sort(l);
        if(l.size()<2) return -1;
        return l.get(1);

    }
    public void dfs(TreeNode root){
        if(root==null) return ;
        l.add(root.val);
        dfs(root.left);
        dfs(root.right);
    }
}