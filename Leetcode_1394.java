//1394. Find Lucky Integer in an Array
class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> dict = new HashMap<>();
        for (int i : arr) {
            dict.put(i, dict.getOrDefault(i, 0) + 1);
        }

        int res = -1;

        for (int i : dict.keySet()) {
            if (i == dict.get(i)) {
                res = Math.max(res, i);
            }
        }

        return res;
    }
}
