//217. Contains Duplicate
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer>map=new HashSet<>();

        for(int i:nums){
           if(!map.add(i)){
            return true;
           }
        }
        return false;
    }
}
