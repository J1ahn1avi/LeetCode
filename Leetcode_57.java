class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();
        for (int i[] : intervals) {
            list.add(i);
        }
        list.add(newInterval);
        list.sort((a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> res = new ArrayList<>();
        int prev[] = list.get(0); 
        for (int i = 1; i < list.size(); i++) {
            int curr[] = list.get(i);
            if (curr[0] <= prev[1]) {
                prev[1] = Math.max(prev[1], curr[1]);
            } else {
                res.add(prev);
                prev = curr;
            }
        }
        res.add(prev);
        return res.toArray(new int[res.size()][]);
    }
}
