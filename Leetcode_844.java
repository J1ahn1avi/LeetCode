//844. Backspace String Compare
class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i1 = s.length() - 1, i2 = t.length() - 1;
        int skip1 = 0, skip2 = 0;
        while (i1 >= 0 || i2 >= 0) {
            while (i1 >= 0) {
                if (s.charAt(i1) == '#') {
                    skip1++;
                    i1--;
                } else if (skip1 > 0) {
                    i1--;
                    skip1--;
                } else {
                    break;
                }
            }
            while (i2 >= 0) {
                if (t.charAt(i2) == '#') {
                    skip2++;
                    i2--;
                } else if (skip2 > 0) {
                    i2--;
                    skip2--;
                } else {
                    break;
                }
            }
            if (i1 >= 0 && i2 >= 0) {
                if (s.charAt(i1) != t.charAt(i2)) {
                    return false;
                }
            } else if (i1 >= 0 || i2 >= 0) {
                return false;
            }
            i1--;
            i2--;
        }
        return true;
    }
}
