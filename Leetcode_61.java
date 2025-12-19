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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp = head;
        int len = 0;
        if (head == null)
            return null;
        if (head.next == null)
            return head;
        while (temp.next != null) {
            temp = temp.next;
            len += 1;
        }
        k = k % (len + 1);
        temp.next = head;

        int jump = len - k;
        ListNode dummy = head;

        while (jump > 0) {
            dummy = dummy.next;
            jump--;
        }
        ListNode res = dummy.next;
        dummy.next = null;
        return res;
    }
}
