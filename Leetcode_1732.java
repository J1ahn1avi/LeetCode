//1732. Find the Highest Altitude
class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int left[]=new int[n+1];
        left[0]=0;
        int mx=0;
        for(int i=1;i<=n;i++){
            left[i]=left[i-1]+gain[i-1];
            if(mx<left[i]) mx=left[i];
        }
        return mx;
    }
}
