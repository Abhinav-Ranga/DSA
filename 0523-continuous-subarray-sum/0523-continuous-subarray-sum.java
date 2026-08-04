class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {

        HashMap<Integer,Integer> f = new HashMap<>();
        
        int n = nums.length;
        int len = 2;
        int sum = 0;

        Boolean isgood = true; 

        f.put(0,-1);



        for(int i=0; i<n; i++){
            sum += nums[i];
            int check = sum % k;
            int freq = f.getOrDefault(check ,0);


            if(f.containsKey(check)){
                if(i-f.get(check) >= len){
                    return true;
                }
            }else{
                f.put(check,i);
            }
        }
        return false;
    }
}