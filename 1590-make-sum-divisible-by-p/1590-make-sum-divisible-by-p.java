import java.util.HashMap;

class Solution {
    public int minSubarray(int[] nums, int p) {
        long totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        
        int target = (int)(totalSum % p);
        if (target == 0) return 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        
        long currentSum = 0;
        int minLen = nums.length;
        
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            int currentRem = (int)(currentSum % p);
            
            int neededRem = (currentRem - target + p) % p;
            
            if (map.containsKey(neededRem)) {
                minLen = Math.min(minLen, i - map.get(neededRem));
            }
            
            map.put(currentRem, i);
        }
        
        return minLen == nums.length ? -1 : minLen;
    }
}