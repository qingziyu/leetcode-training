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
        if (head.next == null) {
            return head;
        }

        ListNode prePointer = null;
        ListNode curPointer = head;

        while(curPointer.next != null) {
            ListNode nextNode = curPointer.next;
            curPointer.next = prePointer;
            prePointer.next = curPointer;
            curPointer = nextNode;
        }

        return prePointer;
    }
}