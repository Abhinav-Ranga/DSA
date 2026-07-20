class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int bestending =nums[0];
        int totalsum = nums[0];
        int maxending = nums[0];

        for(int i=1; i<n; i++){
            totalsum += nums[i];
            bestending = Math.max(nums[i],nums[i]+bestending);

            maxending = Math.max(maxending,bestending);
        
        }
        if(maxending <0){
            return maxending;
        }


        int mincheck = minsum(nums);
        int res = Math.max(maxending,totalsum-mincheck);

        return res;
    }




    public int minsum(int nums[]){
        int n = nums.length;
        int bestending = nums[0];
        int res =nums[0];
        for(int i=1; i<n; i++){
            bestending = Math.min(nums[i],nums[i]+bestending);
            res = Math.min(res,bestending);
        }
        return res;
    }
}