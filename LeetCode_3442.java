//3442. Maximum Difference Between Even and Odd Frequency I
class Solution {
    public int maxDifference(String s) {
        HashMap<Character,Integer>dict=new HashMap<>();

        for(char i : s.toCharArray()){
            dict.put(i,dict.getOrDefault(i,0)+1);
        }

        int max_odd=0;
        int min_even=Integer.MAX_VALUE;

        for(int i:dict.values()){
            if(i%2!=0){
                max_odd=Math.max(max_odd,i);
            }else{
                min_even=Math.min(min_even,i);
            }
        }

        if(min_even==Integer.MAX_VALUE){
            min_even=0;
        }
        return max_odd-min_even;
    }
}
