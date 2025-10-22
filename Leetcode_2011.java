//2011. Final Value of Variable After Performing Operations
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int res=0;
        for (String i:operations){
            if(i.equals("X++") || i.equals("++X")){
                res+=1;
            }else {
                res-=1;
            }
        }
        return res;
    }
}
