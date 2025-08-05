//349. Intersection of Two Arrays
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> res = new HashSet<>();

        for (int i : nums1) {
            set1.add(i);
        }

        for (int i : nums2) {
            if (set1.contains(i)) {
                res.add(i);
            }
        }

        int[] arr = new int[res.size()];
        int j = 0;
        
        for (int i : res) {
            arr[j++] = i;
        }
        return arr;
    }
}
