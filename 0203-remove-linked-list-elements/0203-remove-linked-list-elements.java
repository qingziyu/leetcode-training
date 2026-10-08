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
        ListNode previousNode = null;
        ListNode result = head;

        while (head != null) {
            if (head.val == val) {
                head = head.next;
                if (previousNode != null) {
                    previousNode.next = head;
                } else {
                    result = result.next;
                }
            } else {
                previousNode = head;
                head = head.next;
            }
        }

        return result;
    }
}