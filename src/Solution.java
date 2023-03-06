
  class ListNode {
     int val;
     ListNode next;
      ListNode() {}
     ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        if (list1.val > list2.val) {
            ListNode temp = list1;
            list1 = list2;
            list2 = temp;
        }
        ListNode head = list1;
        ListNode hold = list2;
        while (list1 != null&&hold!=null) {
            if (list1.next!=null){
                if (list1.next.val<= hold.val&&hold.val >= list1.val){
                    list1=list1.next;
                    continue;
                }
            }
            if (hold.val >= list1.val) {
                ListNode temp = list1.next;
                list1.next = hold;
                hold = temp;
                list1 = list1.next;
                continue;
            }
            list1=list1.next;
        }
        return head;
    }
}
