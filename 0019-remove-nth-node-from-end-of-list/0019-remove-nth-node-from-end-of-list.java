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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int size=0;
        int del;

        ListNode curr = head;
        while(curr!=null){
            curr = curr.next;
            size++;
        }
        del = size - n;
        curr = head;

        if (del == 0) {
            return head.next;
        }
        for (int i = 0; i < del - 1; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
    }
}