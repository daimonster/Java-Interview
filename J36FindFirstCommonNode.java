import java.util.*;


//class ListNode {
//    int val;
//    ListNode next = null;
//
//    ListNode(int val) {
//        this.val = val;
//    }
//}
public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        Stack<ListNode> stack1 = new Stack<>();
        Stack<ListNode> stack2 = new Stack<>();
        ListNode head1 = pHead1;
        ListNode head2 = pHead2;
        while (head1 != null) {
            stack1.push(head1);
            head1 = head1.next;
        }
        while (head2 != null) {
            stack2.push(head2);
            head2 = head2.next;
        }
        ListNode res = null;
        while (!stack1.empty() && !stack2.empty()) {
            if(stack1.peek() != stack2.peek()) break;
            res = stack1.peek();
            stack1.pop();
            stack2.pop();
            
        }
        return res;
    }
}
