//83. Remove Duplicates from Sorted List
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
    public ListNode deleteDuplicates(ListNode head) {

        if (head == null)
            return null;
        ListNode temp = head.next;
        ListNode pre = head;
        while (temp != null) {
            if (temp.val == pre.val) {
                temp = temp.next;
            } else {
                pre.next = temp;
                pre = temp;
                temp = temp.next;

            }
        }
        pre.next = null;

        return head;
    }
}
