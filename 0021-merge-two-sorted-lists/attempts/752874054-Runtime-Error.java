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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode result = head;

        while(list1 != null || list2 != null) {
            int nodeVal;

            if (list1.next == null) {
                nodeVal = list2.val;
                list2 = list2.next;
                head = createNewNode(head, nodeVal);
                continue;
            }

            if (list2.next == null) {
                nodeVal = list1.val;
                list1 = list1.next;
                head = createNewNode(head, nodeVal);
                continue;
            }

            int curOneNum = list1.val;
            int curTwoNum = list2.val;
            if (curOneNum > curTwoNum) {
                nodeVal = curTwoNum;
                list2 = list2.next;
            } else {
                nodeVal = curOneNum;
                list1 = list1.next;
            }

            head = createNewNode(head, nodeVal);
        }

        return result.next;
    }

    private ListNode createNewNode(ListNode head, int nodeVal) {
        ListNode newNode = new ListNode();
        newNode.val = nodeVal;
        head.next = newNode;
        head = newNode;

        return head;
    }
}