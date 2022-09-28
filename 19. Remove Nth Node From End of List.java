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
        ListNode left = new ListNode(0, head);
        ListNode res = left;
        ListNode right = left;
        int size = 0;
        while(right != null) {
            size++;
            right = right.next;
            if (size > n + 1) left = left.next;
        }
            left.next = left.next.next; 
        return res.next;
    }
}
