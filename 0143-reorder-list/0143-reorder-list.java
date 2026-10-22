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
    public void reorderList(ListNode head) {
        ArrayList<ListNode> list = new ArrayList<>();

        ListNode temp = head;
        while (temp != null) {
            list.add(temp);
            temp = temp.next;
        }
        int s = 0;
        int l = list.size() - 1;

        while (s < l) {
            list.get(s).next = list.get(l);
            s++;
            if (s==l) {
                break;
            }
            list.get(l).next = list.get(s);
            l--;
        }
        list.get(l).next = null;
    }    
}