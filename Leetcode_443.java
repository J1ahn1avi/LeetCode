//443. String Compression
class Solution {
    public int compress(char[] chars) {
        int res = 0;
        int i = 0;
        while (i < chars.length) {
            char ch = chars[i];
            int cnt = 0;
            while (i < chars.length && ch == chars[i]) {
                cnt++;
                i++;
            }
            chars[res] = ch;
            res++;
            if (cnt > 1) {
                String scnt = String.valueOf(cnt);
                for (char c : scnt.toCharArray()) {
                    chars[res] = c;
                    res++;
                }
            }
        }
        return res;
    }
}
