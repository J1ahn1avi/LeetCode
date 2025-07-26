//3232. Find if Digit Game Can Be Won
class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum1=0;
        int sum2=0;
        for(int i:nums){
            if(i>=1 && i<=9) sum1=sum1+i;
            else if (i>=10 && i<=99) sum2=sum2+i;
        }
        return sum1>sum2 || sum2>sum1;
    }
}
  
