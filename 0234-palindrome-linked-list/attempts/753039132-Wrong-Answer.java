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
        ListNode firstNode = head;
        ListNode lastNode = head;
        Deque<Integer> stack = new ArrayDeque<>();

        while(lastNode.next != null) {
            stack.push(lastNode.val);
            lastNode = lastNode.next;
        }

        while(firstNode != head) {
            int curNum = head.val;
            if (curNum != stack.pop()) {
                return false;
            }

            ListNode nextHead = head.next;
            head.next = lastNode;
            lastNode = head;
            head = nextHead;
        }

        return true;
    }
}