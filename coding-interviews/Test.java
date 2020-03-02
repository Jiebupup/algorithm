import javax.swing.tree.TreeNode;
import java.util.*;

public class Test {
    public String PrintMinNumber(int[] numbers) {
        if (numbers == null || numbers.length == 0)
            return "";
        int len = numbers.length;
        String[] sa = new String[len];
        for (int i = 0; i < len; i++) {
            sa[i] = numbers[i] + "";
        }
        Arrays.sort(sa, (s1, s2) -> (s1 + s2).compareTo(s2 + s1));
        StringBuilder res = new StringBuilder();
        for (String s : sa) {
            res.append(s);
        }
        return res.toString();
    }
}
