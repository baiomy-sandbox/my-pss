import java.util.LinkedList;
import java.util.List;

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
 }

public class Solution {
    public boolean hasCycle(ListNode head) {
        List<ListNode> memList=new LinkedList<>();
        ListNode i=head;
        while (i!=null){
            if (memList.contains(i))return true;
            memList.add(i);
            i=i.next;
        }
        return false;
    }
}