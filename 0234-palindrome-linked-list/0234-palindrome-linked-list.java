class Solution {


    public ListNode middle(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }


    public boolean isPalindrome(ListNode head) {
        ListNode func = middle(head);

        ListNode righthead = func.next;
        func.next =  null;
        ListNode lefthead = head;

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


        while(righthead !=null){
            if(lefthead.val != righthead.val){
                return false;
            }
            lefthead = lefthead.next;
            righthead = righthead.next;
        }
        return true;
    }
}

// revision

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna