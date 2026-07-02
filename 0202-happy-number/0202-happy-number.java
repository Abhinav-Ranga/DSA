class Solution {
    public static int square(int n ){
        
        int sum = 0;
        while(n>0){
            int d = n %10;
            n = n/ 10;
            sum = sum +  d*d;
        }
        return sum ;
    }

    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        while(fast != 1){
            slow = square(slow);
            fast = square(square(fast));

            if(fast ==1){
                return true;
            }

            if(slow == fast){
                return false;
            }
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna