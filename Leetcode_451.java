//451. Sort Characters By Frequency
class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char i : s.toCharArray()) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        List<Character> keys = new ArrayList<>(map.keySet());
        List<Integer> values = new ArrayList<>(map.values());

        String res = "";

        while (!values.isEmpty()) {
            int max = Collections.max(values);
            int i = values.indexOf(max);
            char ch = keys.get(i);
            for (int j = 0; j < max; j++) {
                res += ch;
            }
            keys.remove(i);
            values.remove(i);
        }
        return res;
    }
}
