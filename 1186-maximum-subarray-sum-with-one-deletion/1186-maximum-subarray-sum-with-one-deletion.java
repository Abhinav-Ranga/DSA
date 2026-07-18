class Solution {
    public int maximumSum(int[] arr) {
        int n = arr.length;
        int nodelete = arr[0];
        int onedelete = Integer.MIN_VALUE;
        int res = arr[0];


        for(int i=1; i<n; i++){
            int prevnodelete = nodelete;
            int prevonedelete = onedelete;


            int v;
            if(onedelete == Integer.MIN_VALUE){
                v = Integer.MIN_VALUE;
            }else{
                v = arr[i]+onedelete;
            }

            onedelete = Math.max(v,nodelete);

            nodelete = Math.max(arr[i],arr[i]+nodelete);
            res = Math.max(res,Math.max(nodelete,onedelete));
        }
        return res;   
    }
}