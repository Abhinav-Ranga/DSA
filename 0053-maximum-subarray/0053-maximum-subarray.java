class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int bestending = nums[0];
        int res = nums[0];

        for(int i=1; i<n; i++){
            int val1 = nums[i]+ bestending;
            int val2 = nums[i];

            bestending = Math.max(val1,val2);
            res = Math.max(bestending,res);
        }

        return res;
    }
}