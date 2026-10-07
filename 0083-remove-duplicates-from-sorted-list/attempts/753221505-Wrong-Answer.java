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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode previousPointer = head;
        ListNode currentPointer = head.next;

        while (currentPointer != null) {
            int previouNum = previousPointer.val;
            int currentNum = currentPointer.val;

            if (previouNum == currentNum) {
                currentPointer = currentPointer.next;
            } else {
                previousPointer.next = currentPointer;
                previousPointer = previousPointer.next;
                currentPointer = currentPointer.next;
            }
        }

        return head;
    }
}