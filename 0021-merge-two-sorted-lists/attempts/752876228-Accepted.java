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

            if (list1 == null) {
                head = createNewNode(head, list2);
                break;
            }

            if (list2 == null) {
                head = createNewNode(head, list1);
                break;
            }

            int curOneNum = list1.val;
            int curTwoNum = list2.val;
            if (curOneNum > curTwoNum) {
                head = createNewNode(head, list2);
                list2 = list2.next;
            } else {
                head = createNewNode(head, list1);
                list1 = list1.next;
            }            
        }

        return result.next;
    }

    private ListNode createNewNode(ListNode head, ListNode nextNode) {
        head.next = nextNode;
        head = nextNode;

        return head;
    }
}