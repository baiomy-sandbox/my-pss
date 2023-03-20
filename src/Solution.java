class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n){
        ListNode ans=new ListNode();
        ans.next=head;
        ListNode fast=ans;
        ListNode slow=ans;

        for(int i=1;i<=n;i++){
            fast=fast.next;
        }

        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return ans.next;
    }
}