//2325. Decode the Message
class Solution {
    public String decodeMessage(String key, String message) {
        Map<Character, Character> res = new HashMap<>();
        char ch = 'a';
        for (char i : key.toCharArray()) {
            // if(i!=' ' && !res.containsKey(i)) res.put(i,ch++);
            if (Character.isLetter(i)) {
                if (!res.containsKey(i) && i != ' ') {
                    res.put(i, ch);
                    ch++;
                }
            }
        }
        res.put(' ', ' ');

        String temp = "";
        for (char i : message.toCharArray()) {
            temp += res.get(i);
            // if(i==' ') temp+=' ';
            // else temp+=res.get(i);
        }
        return temp;
    }
}
