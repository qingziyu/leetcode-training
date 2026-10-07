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
        int preNum = previousPointer.val;
        int curNum = currentPointer.val;

        while (currentPointer != null) {
            if (curNum == preNum) {
                preNum = currentPointer.val;
                currentPointer = currentPointer.next;
                curNum = currentPointer.val;
            } else {
                previousPointer.next = currentPointer;
                previousPointer = previousPointer.next;
                preNum = currentPointer.val;
                currentPointer = currentPointer.next;
                curNum = currentPointer.val;
            }
        }

        return head;
    }
}