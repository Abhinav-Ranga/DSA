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
    public int pairSum(ListNode head) {

        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode mid = slow;
        ListNode righthead = mid.next;

        mid.next = null;


        ListNode curr = righthead;
        ListNode prev = null;
        ListNode next;

        while( curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        righthead = prev;
        ListNode lefthead = head;

        int maxts = Integer.MIN_VALUE;

        while(lefthead != righthead){
            int twinsum = lefthead.val + righthead.val;

            if( twinsum > maxts){
                maxts = twinsum;
            }

            lefthead = lefthead.next;
            righthead = righthead.next;

        }
        return maxts;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna