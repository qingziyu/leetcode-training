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
        int result;

        while (pointer != null) {
            count++;
            pointer = pointer.next;
        }

        mid = count/2;
        pointer = head;

        while (mid > 0) {
            mid--;
            pointer = pointer.next;
        }

        return pointer;
    }
}