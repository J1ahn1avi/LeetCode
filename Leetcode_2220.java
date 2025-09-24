//2220. Minimum Bit Flips to Convert Number
class Solution {
    public int minBitFlips(int start, int goal) {
        int count=0;
        int i=start^goal;
        while(i!=0){
            i=i & (i-1);
            count++;
        }
        return count;
    }
}
