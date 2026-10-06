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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode previousNode = null;
        int count = 0;

        while(fast.next != null) {
            fast = fast.next;
            slow = slow.next;
            count++;
            if (fast.next == null) {
                break;
            }

            fast = fast.next;
            count++;
        }

        while(head != slow) {
            ListNode nextNode = head.next;
            head.next = previousNode;
            previousNode = head;
            head = nextNode;
        }

        ListNode leftPointer = null;
        ListNode rightPointer = null;

        if (count%2 == 0) {
            leftPointer = previousNode;
            rightPointer = slow;
        } else {
            leftPointer = previousNode;
            rightPointer = slow.next;
        }

        while(rightPointer != null) {
            int currentRight = rightPointer.val;
            int currentLeft = leftPointer.val;

            if (currentLeft != currentRight) {
                return false;
            }

            rightPointer = rightPointer.next;
            leftPointer = leftPointer.next;
        }

        return true;
    }
}