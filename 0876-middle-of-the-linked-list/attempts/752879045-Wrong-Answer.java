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
        ListNode pointer = head;
        int count = 0;
        int mid = 0;

        while (head != null) {
            pointer = pointer.next;
            head = head.next;
            if (head == null) {
                break;
            }
            
            head = head.next;
        }

        return pointer;
    }
}