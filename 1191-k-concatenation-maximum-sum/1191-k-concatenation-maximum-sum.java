class Solution {
    public int kConcatenationMaxSum(int[] arr, int k) {
        int n = arr.length;
        long MOD = 1000000007;

        long totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        int limit = (k == 1) ? n : 2 * n;

        long currentMax = 0;
        long maxSoFar = 0;

        for (int i = 0; i < limit; i++) {
            currentMax = Math.max(0L, currentMax + arr[i % n]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }

        if (k > 2 && totalSum > 0) {
            long middleSum = ((k - 2) * totalSum) % MOD;
            maxSoFar = (maxSoFar + middleSum) % MOD;
        } else {
            maxSoFar = maxSoFar % MOD;
        }

        return (int) maxSoFar;
    }
}