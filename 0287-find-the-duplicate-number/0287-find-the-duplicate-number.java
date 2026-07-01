class Solution {
    public int findDuplicate(int[] nums) {
        int slow = 0;
        int fast = 0;

        while(true){
            
         slow = nums[slow];
         fast = nums[nums[fast]];

         if( slow == fast){
            break;
         }

        }
        slow = 0;
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}

// in this question the only thing is we are using linked list logic here inside the memory it is still an array but
// we are travesing it as a linked list  
// steps
// when u are at any index then the value itself will behave like index and u are not traversing here contiguously 
// inside the memory it is still contiguous array but we are not traversing it like normal array 

// so in linked list the node that is being pointed  by two nodes  means it is the starting of the cycle means 
// that particular node is coming again (repeating) so by this logic 
// we will use slow and fast pointer and find out the circle and when we get starting of the cycle so that value is repeating

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna