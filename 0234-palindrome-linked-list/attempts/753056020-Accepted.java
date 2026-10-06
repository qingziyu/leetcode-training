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
        ListNode previousNode = null;
        ArrayList<Integer> list = new ArrayList<Integer>();

        while(head != null) {
            int curNum = head.val;
            list.add(curNum);

            ListNode nextHead = head.next;
            head.next = previousNode;
            previousNode = head;
            head = nextHead;
        }

        int index = 0;

        while(previousNode != null) {
            int curNum = previousNode.val;
            if (curNum != list.get(index)) {
                return false;
            }

            previousNode = previousNode.next;
            index++;
        }

        return true;
    }
}