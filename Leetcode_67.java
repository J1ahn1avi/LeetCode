//67. Add Binary
class Solution {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {
            int bita = (i >= 0) ? a.charAt(i) - '0' : 0;
            int bitb = (j >= 0) ? b.charAt(j) - '0' : 0;

            int sum = bita + bitb + carry;
            res.append(sum % 2);
            carry = sum / 2;

            i--;
            j--;
        }
        return res.reverse().toString();
    }
}
