class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        
        HashMap<Integer, Integer> map  = new HashMap<>();

        int n = nums.length;
        int res = 0;
        int currsum = 0;

        map.put(0,1);

        for(int i=0; i<n; i++){
            currsum += nums[i];

            int checker = currsum-goal;

            int frequency = map.getOrDefault(checker,0);

            res += frequency;

            map.put(currsum,map.getOrDefault(currsum,0)+1);
        }
        return res;
    }

}