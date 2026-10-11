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

        ListNode preNode = null;
        ListNode curNode = head;

        while (curNode.next != tail) {
            ListNode nextNode = curNode.next;
            curNode.next = preNode;
            preNode = curNode;
            curNode = nextNode;  
        }

        tail.next = curNode;

        return tail;
    }
}