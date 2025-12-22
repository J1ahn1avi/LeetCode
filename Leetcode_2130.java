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
    public int pairSum(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        int max = 0;
        //midd
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        //rev order
        ListNode nextNode = slow;
        ListNode prev = null;
        while (slow != null) {
            nextNode = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nextNode;
        }

        //sum
        while (prev != null) {
            int csum = prev.val + head.val;
            max = Math.max(max, csum);
            prev = prev.next;
            head = head.next;
        }
        return max;
    }
}
