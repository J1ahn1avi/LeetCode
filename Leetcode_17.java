//17. Letter Combinations of a Phone Number
class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Character,String> res=new HashMap<>();
        res.put('2', "abc");
        res.put('3', "def");
        res.put('4', "ghi");
        res.put('5', "jkl");
        res.put('6', "mno");
        res.put('7', "pqrs");
        res.put('8', "tuv");
        res.put('9', "wxyz");

        int n=digits.length();
        if(n==0) return new ArrayList<>();
        if(n==1) return my_tolist(res.get(digits.charAt(0)));

        List<String> temp=my_tolist(res.get(digits.charAt(0)));
        for(int i=1;i<n;i++){
            temp=my_tocombine(temp,my_tolist(res.get(digits.charAt(i))));
        }
        return temp;
    }

    private List<String> my_tolist(String s){
        List<String> mylist=new ArrayList<>();
        for(char ch:s.toCharArray()){
            mylist.add(String.valueOf(ch));
        }
        return mylist;
    }

    private List<String> my_tocombine(List<String> s1, List<String> s2){
        List<String> arr=new ArrayList<>();
        for(String a:s1){
            for(String b: s2){
                arr.add(a+b);
            }
        }
        return arr;
    }
}

