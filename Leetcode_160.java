/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a=headA;
        ListNode b=headB;
        int lena=0;
        int lenb=0;
        while(a!=null){
            a=a.next;
            lena+=1;
        }
        while(b!=null){
            b=b.next;
            lenb+=1;
        }
        while(lena>lenb){
            headA=headA.next;
            lena--;
        }

        while(lena<lenb){
            headB=headB.next;
            lenb--;
        }

        while(headA!=null){
            if(headA==headB){
                return headB;
            }
            headA=headA.next;
            headB=headB.next;
        }
        return headA;
    }
}
