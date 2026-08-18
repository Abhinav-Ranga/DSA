import java.util.Arrays;

class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] == b[0]) {
                return b[1] - a[1];
            }
            return a[0] - b[0];
        });

        int n = intervals.length;
        int res = 0;

        int c = intervals[0][0];
        int d = intervals[0][1];

        for (int i = 1; i < n; i++) {
            int a = intervals[i][0];
            int b = intervals[i][1];

            if (c <= a && b <= d) {
                res++;
            } else {
                c = a;
                d = b;
            }
        }

        return n - res;
    }
}