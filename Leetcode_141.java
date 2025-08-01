//141. Linked List Cycle
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null) return false;

        Map<ListNode ,Boolean>map=new HashMap<>();
        ListNode temp=head;
        while(temp!=null){
            if(map.get(temp)!=null){
                return true;
            }
            map.put(temp,true);
            temp=temp.next;
        }
        return false;
    }
}
