//350. Intersection of Two Arrays II
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> dict = new HashMap<>();
        List<Integer> res = new ArrayList<>();

        for (int i : nums1) {
            dict.put(i, dict.getOrDefault(i, 0) + 1);
        }

        for (int i : nums2) {
            if (dict.containsKey(i) && dict.get(i) > 0) {
                res.add(i);
                dict.put(i, dict.get(i) - 1);
            }
        }

        int arr[] = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            arr[i] = res.get(i);
        }

        return arr;
    }
}
