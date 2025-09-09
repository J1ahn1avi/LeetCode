//2900. Longest Unequal Adjacent Groups Subsequence I
class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String>res=new ArrayList<>();
        res.add(words[0]);
        int prev=groups[0];

        for(int i=1;i<words.length;i++){
            if(groups[i]!=prev){
                res.add(words[i]);
                prev=groups[i];
            }
        }
        return res;
    }
}
