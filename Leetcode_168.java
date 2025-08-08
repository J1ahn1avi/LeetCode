//168. Excel Sheet Column Title
class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder res = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            int rem = columnNumber % 26;
            char ch = (char) ('A' + rem);
            res.append(ch);
            columnNumber /= 26;
        }
        return res.reverse().toString();
    }
}
