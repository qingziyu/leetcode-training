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
    public ListNode removeElements(ListNode head, int val) {
        ListNode nodePointer = head;
        ListNode result = head;

        while (head != null) {
            if (head.val != val) {
                nodePointer.next = head;
            }

            head = head.next;
        }

        return result;
    }
}