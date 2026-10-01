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

        Deque<Integer> stack = new ArrayDeque<>();

        while(head != null) {
            stack.push(head.val);
            head = head.next;
        }

        ListNode node = new ListNode();
        ListNode tail = node;

        while(!stack.isEmpty()) {
            int currentInt = stack.pop();
            ListNode newNode = new ListNode();
            newNode.val = currentInt;
            node.next = newNode;
            node = newNode;
        }

        return tail.next;
    }
}