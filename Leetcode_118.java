//118. Pascal's Triangle
import java.util.*;
class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> res = new ArrayList<>();
        if (n == 0)
            return res;

        res.add(new ArrayList<>());
        res.get(0).add(1);

        for (int i = 1; i < n; i++) {
            List<Integer> prev = res.get(i - 1);
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for (int j = 1; j < i; j++) {
                row.add(prev.get(j - 1) + prev.get(j));
            }
            row.add(1);
            res.add(row);
        }
        return res;
    }

}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int numRows = sc.nextInt();

        Solution sol = new Solution();
        List<List<Integer>> triangle = sol.generate(numRows);

        for (List<Integer> row : triangle) {
            System.out.println(row);
        }
    }
}
