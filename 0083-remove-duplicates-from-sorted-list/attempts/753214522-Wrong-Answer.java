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
            int currentNum = currentPointer.val;
            int preNum = previousPointer.val;

            if (currentNum == preNum) {
                currentPointer = currentPointer.next;
            } else {
                previousPointer = previousPointer.next;
                currentPointer = currentPointer.next;
            }
        }

        return head;
    }
}