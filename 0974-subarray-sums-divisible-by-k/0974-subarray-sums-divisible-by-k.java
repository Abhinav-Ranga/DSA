class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> f = new HashMap<>();


        int n = nums.length;
        int sum = 0;
        int res = 0;

        f.put(0 , 1);

        for(int i=0; i<n; i++){
            sum += nums[i];
            int remainder = sum %k;


            if(remainder < 0 ){
                remainder  = remainder + k;
            }

            int freq = f.getOrDefault(remainder, 0);

            res += freq;


            f.put(remainder, f.getOrDefault(remainder,0)+1);
        }
        return res; 
    }
}