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
    public ListNode sortList(ListNode head) {
       ArrayList<Integer>list=new ArrayList<>();
       while(head!=null){
            list.add(head.val);
            head=head.next;
       }
       Collections.sort(list);
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        for (int x : list) {
            temp.next = new ListNode(x);
            temp = temp.next;
        }
        return dummy.next;
    }
}