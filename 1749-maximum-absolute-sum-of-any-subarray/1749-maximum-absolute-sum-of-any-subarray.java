class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n = nums.length;
        int AS = Math.abs(nums[0]);

        int currmax = nums[0];
        int currmin = nums[0];
        

        for(int i=1; i<n; i++){ 

            currmax = maxsum(nums,i,currmax);
            currmin = minsum(nums,i,currmin);

            int maxoption  = Math.abs(currmax);
            int minoption  = Math.abs(currmin);

            AS = Math.max(AS,Math.max(maxoption, minoption));
        }
        return AS;
    }



    public int maxsum(int [] nums,int i,int bestending){

        int v1 = nums[i];
        int v2 = nums[i]+bestending;

        bestending = Math.max(v1,v2);

        return bestending;
    }

 
    
  
    public int minsum(int [] nums,int i,int bestending){

        int v1 = nums[i];
        int v2 = nums[i]+bestending;

        bestending = Math.min(v1,v2);

        return bestending ;
}
}