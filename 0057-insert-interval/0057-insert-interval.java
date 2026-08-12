
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        ArrayList<int[]> res = new ArrayList<>();
        int n = intervals.length;
        int start = newInterval[0];
        boolean isinserted = false;

        for (int i = 0; i < n; i++) {
            if (isinserted == false && start < intervals[i][0]) {
                res.add(newInterval);
                isinserted = true;
            }
            res.add(intervals[i]);
        }

        if (isinserted == false) {
            res.add(newInterval);
        }

        ArrayList<int[]> merged = new ArrayList<>();

        int start1 = res.get(0)[0];
        int end1 = res.get(0)[1];

        for (int i = 1; i < res.size(); i++) {
            int start2 = res.get(i)[0];
            int end2 = res.get(i)[1];

            if (end1 >= start2) {
                end1 = Math.max(end1, end2);
            } else {
                merged.add(new int[]{start1, end1});
                start1 = start2;
                end1 = end2;
            }
        }

        merged.add(new int[]{start1, end1});

        return merged.toArray(new int[merged.size()][]);
    }
}