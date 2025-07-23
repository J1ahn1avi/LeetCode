//205. Isomorphic Strings

class Solution {
    public boolean isIsomorphic(String s, String t) {
       HashMap<Character,Character> res1=new HashMap<>();
       HashMap<Character,Character> res2=new HashMap<>();

       for(int i=0;i<s.length();i++){
            char sch=s.charAt(i);
            char tch=t.charAt(i);

            if(res1.containsKey(sch)){
                if(res1.get(sch)!=tch) 
                    return false;
            }
            else res1.put(sch,tch);

            if(res2.containsKey(tch)){
                if(res2.get(tch)!=sch) 
                    return false;
            }
            else res2.put(tch,sch);

       }
       return true;
    }
}
