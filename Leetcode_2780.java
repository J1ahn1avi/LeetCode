//2780. Minimum Index of a Valid Split
class Solution {
    public int minimumIndex(List<Integer> nums) {
        HashMap<Integer, Integer> left = new HashMap<>();
        HashMap<Integer, Integer> right = new HashMap<>();

        for (int i : nums) {
            right.put(i, right.getOrDefault(i, 0) + 1);
        }

        int len = nums.size();

        for (int i = 0; i < len - 1; i++) {
            int n = nums.get(i);
            left.put(n, left.getOrDefault(n, 0) + 1);
            right.put(n, right.get(n) - 1);

            if ((left.get(n) * 2 > (i + 1)) && (right.get(n) * 2) > (len - 1 - i)) {
                return i;
            }
        }
        return -1;
    }
}
