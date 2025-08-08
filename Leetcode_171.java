//171. Excel Sheet Column Number
class Solution {
    public int titleToNumber(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int value = ch - 'A' + 1;
            res = res * 26 + value;
        }
        return res;
    }
}
