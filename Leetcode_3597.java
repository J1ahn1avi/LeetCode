//3597. Partition String 
class Solution {
    public List<String> partitionString(String s) {
        Map<String, Integer> map = new HashMap<>();
        List<String> res = new ArrayList<>();
        String first = String.valueOf(s.charAt(0));
        res.add(first);
        map.put(first, 1);

        int i = 1;
        String curr = "";

        while (i < s.length()) {
            curr += s.charAt(i);
            if (!map.containsKey(curr)) {
                res.add(curr);
                map.put(curr, 1);
                curr = "";
            }
            i++;
        }
        return res;
    }
}
