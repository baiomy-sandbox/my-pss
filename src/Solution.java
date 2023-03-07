import java.util.LinkedList;
import java.util.List;

 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list=new LinkedList<>();
        addInorderToList(list,root);
        return list;
    }
    public void addInorderToList(List<Integer> list, TreeNode node){
        if (node==null)return;
        addInorderToList(list,node.left);
        list.add(node.val);
        addInorderToList(list,node.right);
    }
}