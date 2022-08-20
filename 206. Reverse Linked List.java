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
    public ListNode reverseList(ListNode head) {
        ListNode previous = null;
        
        if(head == null)
            return null;
        
        while(head!= null)
        {
            ListNode temp = head.next;
            head.next= previous;
            previous = head;
            head = temp;
        }
        return previous;
    }
}