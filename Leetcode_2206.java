//2206. Divide Array Into Equal Pairs
class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer, Integer> dict = new HashMap<>();
        for (int i : nums) {
            dict.put(i, dict.getOrDefault(i, 0) + 1);
        }

        boolean res = false;

        for (int i : dict.values()) {
            if (i % 2 != 0) {
                return false;
            } 
        }
        return true;
    }
}
