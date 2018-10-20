
/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/
class Solution {

    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if(pHead == null) return null;
        ListNode fast = pHead;
        ListNode slow = pHead;
        while(fast.next != null && fast != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) break;
        }
        if(fast.next == null || fast == null) return null;
        slow = pHead;
        while(fast != slow){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}