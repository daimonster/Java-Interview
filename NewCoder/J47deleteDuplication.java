
/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/
public class Solution {
    public ListNode deleteDuplication(ListNode pHead)
    {
        if(pHead == null || pHead.next == null) return pHead;
        ListNode preHead = ListNode(-1);
        preHead.next = pHead;
        ListNode fast = preHead.next;
        ListNode slow = preHead;
        while(fast != null){
            while(fast.next != null && fast.next.val == fast.val){
                fast = fast.next;
            }
            if(slow.next != fast){
                fast = fast.next;
                slow.next = fast;
            }else{
                slow = fast;
                fast = fast.next;
            }
        }
        return preHead.next;
    }
}