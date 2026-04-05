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
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        int count = 0;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            count++;
        }
        // slow.val = slow.next.val;
        // slow.next = slow.next.next;
        // return slow;
        ListNode temp = head;
        int i = 0;
        while(i < count - 1){
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        return head;

    }
}