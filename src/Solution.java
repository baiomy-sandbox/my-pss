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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA==headB)return headA;
        int lengthA=1;
        int lengthB=1;
        ListNode tailA=headA;
        ListNode tailB=headB;
        while (tailA.next!=null){
            lengthA++;
            tailA=tailA.next;
            if (tailA==tailB)return tailA;
        }
        while (tailB.next!=null){
            lengthB++;
            tailB=tailB.next;
            if (tailA==tailB)return tailB;
        }
        if (tailB!=tailA)return null;
        tailA=headA;
        tailB=headB;
        ListNode intersection=null;
        if (lengthA>lengthB){
           while (lengthA>lengthB){
               tailA=tailA.next;
               lengthA--;
           }
           while (tailA!=tailB){
               tailA=tailA.next;
               tailB=tailB.next;
               intersection=tailA;
           }
           return intersection;
       }
        while (lengthB>lengthA){
            tailB=tailB.next;
            lengthB--;
        }
        while (tailA!=tailB){
            tailA=tailA.next;
            tailB=tailB.next;
            intersection=tailA;
        }
        return intersection;
    }
}