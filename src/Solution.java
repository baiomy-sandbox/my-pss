
 public class TreeNode {
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
    public TreeNode sortedArrayToBST(int[] nums) {
if (nums==null||nums.length==0)return null;
return constructArray(nums,0,nums.length-1);
    }
    public TreeNode constructArray(int[] nums,int left,int right){
        if (left>right)return null;
        int mid=left+(right-left)/2;
        return new TreeNode(nums[mid],constructArray(nums,left,mid-1),constructArray(nums,mid+1,right));
    }
}