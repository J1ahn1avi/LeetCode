//202. Happy Number
class Solution {
    public boolean isHappy(int n) {
        Set<Integer>map=new HashSet<>();
        
        while(n!=1){
            if(!map.contains(n)){
                map.add(n);
                int sum=0;
                int temp=n;
                while(temp!=0){
                    int rem=temp%10;
                    sum+=rem*rem;
                    temp/=10;
                }
                n=sum;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
