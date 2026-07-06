class Solution {

    public boolean circularArrayLoop(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {

            // Skip already visited
            if (nums[i] == 0)
                continue;

            int slow = i;
            int fast = i;

            // Direction (true = positive, false = negative)
            boolean direction = nums[i] > 0;

            while (true) {

                // Direction check
                if ((nums[slow] > 0) != direction)
                    break;

                if ((nums[fast] > 0) != direction)
                    break;

                int nextFast = nextIndex(nums, fast);

                if ((nums[nextFast] > 0) != direction)
                    break;

                // Move pointers
                slow = nextIndex(nums, slow);
                fast = nextIndex(nums, nextFast);

                // Cycle found
                if (slow == fast) {

                    // Self-loop is not allowed
                    if (slow == nextIndex(nums, slow))
                        break;

                    return true;
                }
            }

            // Mark visited path as 0
            int current = i;

            while ((nums[current] > 0) == direction) {
                int next = nextIndex(nums, current);
                nums[current] = 0;

                if (current == next)
                    break;

                current = next;
            }
        }

        return false;
    }

    private int nextIndex(int[] nums, int current) {
        int n = nums.length;
        return ((current + nums[current]) % n + n) % n;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna