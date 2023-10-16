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
        if(head == null || head.next == null) {
            return true;
        }

        ListNode a = head;
        ListNode b = head.next;

        while(b != null && b.next != null) {
            a = a.next;
            b = b.next.next;
        }

        ListNode revList = reverse(a.next);
        a = head;
        b = revList;

        while(b != null) {
            if(a.val != b.val) {
                return false;
            }

            a = a.next;
            b = b.next;
        }

        return true;
    }

    private ListNode reverse(ListNode tail) {
        ListNode rev = new ListNode(-1);

        while(tail != null) {
            ListNode c = tail.next;
            tail.next = rev.next;
            rev.next = tail;
            tail = c;
        }

        return rev.next;
    }
}