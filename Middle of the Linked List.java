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
    public ListNode middleNode(ListNode head) {
        boolean odd = false;
        ListNode ptr = head;
        while(head.next!=null){
            head = head.next;
            if(!odd){
                odd = true;
                ptr = ptr.next;
            } 
            else{
                odd = false;
            }
            // System.out.print(ptr.val+" "+lst.val+"** ");
        }
        return ptr;
    }
}
