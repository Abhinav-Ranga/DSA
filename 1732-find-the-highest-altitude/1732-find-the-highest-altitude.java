class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int ha = 0;
        int curr = 0;

        for(int i=0; i<n; i++){
            curr += gain[i];

            ha = Math.max(curr,ha);
        }
        return ha;
    }
}