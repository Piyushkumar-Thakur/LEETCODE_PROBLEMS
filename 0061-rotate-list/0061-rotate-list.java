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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;

        // Find length
        int n = 1;
        ListNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
            n++;
        }

        //This will  Remove unnecessary rotations
        k = k % n;

        if (k == 0)
            return head;

        // Make list circular
        temp.next = head;

        // Find new tail
        temp = head;
        for (int i = 1; i < n - k; i++) {
            temp = temp.next;
        }

        // New head
        ListNode newHead = temp.next;

        // Break the circle
        temp.next = null;
        return newHead;
    }
}