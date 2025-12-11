//92. Reverse Linked List II
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || head.next == null)
            return head;
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode leftptr = temp;
        ListNode curr = head;
        for (int i = 1; i < left; i++) {
            leftptr = leftptr.next;
            curr = curr.next;
        }
        ListNode pre = null;
        ListNode shead = curr;
        for (int i = 0; i <= (right - left); i++) {
            ListNode nextN = curr.next;
            curr.next = pre;
            pre = curr;
            curr = nextN;
        }
        leftptr.next = pre;
        shead.next = curr;
        return temp.next;
    }
}
