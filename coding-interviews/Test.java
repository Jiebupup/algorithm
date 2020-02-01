import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Test {
    public ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> res = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return res;
        int left = 0;
        int right = matrix[0].length - 1;
        int up = 0;
        int down = matrix.length - 1;
        while (left <= right && up <= down) {
            for (int i = left; i <= right; i++) {
                res.add(matrix[up][i]);
            }
            for (int i = up + 1; i <= down; i++) {
                res.add(matrix[i][right]);
            }
            if (up != down) {
                for (int i = right - 1; i >= left; i--) {
                    res.add(matrix[down][i]);
                }
            }
            if (left != right) {
                for (int i = down - 1; i >= up + 1; i--) {
                    res.add(matrix[i][left]);
                }
            }
            left++;
            up++;
            right--;
            down--;
        }
        return res;
    }
}
