//383. Ransom Note
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> res = new HashMap<>();
        for (char i : magazine.toCharArray()) {
            if (res.containsKey(i)) {
                res.put(i, res.get(i) + 1);
            } else {
                res.put(i, 1);
            }
        }

        for (char i : ransomNote.toCharArray()) {
            if (!res.containsKey(i) || res.get(i) == 0) {
                return false;
            } else {
                res.put(i, res.get(i) - 1);
            }
        }
        return true;
    }
}
