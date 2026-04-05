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
    public ListNode middleNode(ListNode head) {
        // int st = 0;
        // int end = 0;
        // int count = 0;
        // ListNode temp = head;
        // while(temp != null){
        //     temp = temp.next;
        //     count++;
        // }
        // end = count;
        // int mid = st +(end-st)/2;
        // ListNode temp1 = head;
        // int i = 0;
        // while(temp1!= null && i < mid){
        //     temp1 = temp1.next;
        //     i++;
        // }
        // return temp1;
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}