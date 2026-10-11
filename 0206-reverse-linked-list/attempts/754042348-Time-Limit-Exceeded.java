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
        if (head == null) {
            return head;
        }

        ListNode tail = head;

        while(tail.next != null) {
            tail = tail.next;
        }

        boolean first = true;

        while (head != tail) {
            ListNode nextNode = head.next;
            nextNode.next = head;

            if (first) {
                head.next = null;
            }
            
            head = nextNode;
        }

        return tail;
    }
}