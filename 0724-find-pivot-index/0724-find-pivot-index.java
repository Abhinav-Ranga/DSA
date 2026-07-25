class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int Sum = 0;
        int left = 0;

        for (int i = 0; i < n; i++) {
            Sum += nums[i];
        }

        if (Sum - nums[0] == 0) {
            return 0;
        }

        for (int i = 1; i < n; i++) {
            left += nums[i - 1];
            int right = Sum - nums[i] - left;
            
            
             if(left == right){
                return i;
            }
        }
        return -1;
    }
}