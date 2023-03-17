    class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode head=new ListNode(l1.val+l2.val);
            ListNode addition=head;;
            int lastSum=(l1.val+l2.val)/10;
            l1=l1.next;
            l2=l2.next;
            System.out.println("l1 = "+l1.val+" l2 = "+l2.val+" last sum = "+lastSum+" s = "+((l1.val+l2.val)%10+lastSum)%10+" addition = "+addition.val+" next = "+addition.val);
            while (l1!=null||l2!=null){
                int l1v=l1==null?0:l1.val;
                int l2v=l2==null?0:l2.val;
                int s=((l1v+l2v)%10+lastSum)%10;
                addition.next=new ListNode(s);
                System.out.println("l1 = "+l1v+" l2 = "+l2v+" last sum = "+lastSum+" s = "+s+" addition = "+addition.val+" next = "+addition.val);
                addition=addition.next;
                lastSum=(l1v+l2v)/10;
                if (l1!=null)l1=l1.next;
                if (l2!=null)l2=l2.next;
            }
            return head;
        }
    }