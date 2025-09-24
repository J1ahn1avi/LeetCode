//1720. Decode XORed Array
class Solution {
    public int[] decode(int[] arr, int first) {
        int n=arr.length;
        int res[]=new int[n+1];
        res[0]=first;
        for(int i=0;i<n;i++){
            res[i+1]=res[i]^arr[i];
        }
        return res;
    }
}
