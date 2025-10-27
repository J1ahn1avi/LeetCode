//2956. Find Common Elements Between Two Arrays
class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int res[]=new int[2];

        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();

        for(int i:nums1){
            set1.add(i);
        }

        for(int i:nums2){
            set2.add(i);
        }

        for(int i:nums2){
            if(set1.contains(i)) res[1]++;
        }

        for(int i:nums1){
            if(set2.contains(i)) res[0]++;
        }
        return res;
    }
}
