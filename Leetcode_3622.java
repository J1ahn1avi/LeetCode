//3622. Check Divisibility by Digit Sum and Product
class Solution {
    public boolean checkDivisibility(int n) {
        int temp=n;
        int res1=0;
        int res2=1;
        while(temp!=0){
            res1+=temp%10;
            res2*=temp%10;
            temp=temp/10;
        }
        return n%(res1+res2)==0;        
    }
}
