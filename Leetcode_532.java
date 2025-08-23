//532. K-diff Pairs in an Array
class Solution {
    public int findPairs(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int i : map.keySet()) {
            if (k == 0 && map.get(i) > 1) {
                count++;
            }
            if (k > 0 && map.containsKey(k + i)) {
                count++;
            }
        }
        return count;
    }
}
