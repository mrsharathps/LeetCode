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
    public static ListNode removeElements(ListNode head, int val) {

        ListNode placeHolder = new ListNode(0);
        placeHolder.next = head;

        ListNode current = placeHolder;

        while (current.next != null) {
            if (current.next.val == val) {
                // Skip the node with matching value
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return placeHolder.next;
    }
        
    public static void main(String[] args){
        ListNode head = new ListNode(7);
        head.next = new ListNode(7);
        head.next.next = new ListNode(7);
        head.next.next.next = new ListNode(7);

        int val = 7;

        System.out.println(removeElements(head, val));

    }
}