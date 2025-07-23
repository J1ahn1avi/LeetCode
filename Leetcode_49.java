//49. Group Anagrams

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> res=new HashMap<>();
        for(String i:strs){
            char ch[]=i.toCharArray();
            Arrays.sort(ch);
            String s=new String(ch);
            if(!res.containsKey(s)) 
                res.put(s,new ArrayList<>());
            res.get(s).add(i);
        }
        return new ArrayList<>(res.values());
    }
}
