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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode temp=head;
        int len=0;
        while(temp.next!=null){
            len++;
            temp=temp.next;
        }
        int jump=(len+1)-n;
        ListNode ptr=dummy;
        while(jump>0){
            ptr=ptr.next; 
            jump--;
        }
        ptr.next=ptr.next.next;  
        return dummy.next;
    }
}
