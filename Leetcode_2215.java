//2215. Find the Difference of Two Arrays
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer>seen1=new HashSet<>();
        Set<Integer>seen2=new HashSet<>();
        List<List<Integer>>res=new ArrayList<>();
        res.add(new ArrayList<>());
        res.add(new ArrayList<>());
        for(int i:nums1){
            seen1.add(i);
        }
        for(int i:nums2){
            seen2.add(i);
        }

        for(int i:seen1){
            if(!seen2.contains(i)){
                res.get(0).add(i);
            }
        }
        for(int i:seen2){
            if(!seen1.contains(i)){
                res.get(1).add(i);
            }
        }
        return res;
    }
}
