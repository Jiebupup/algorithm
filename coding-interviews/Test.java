public class Test {
    public int StrToInt(String str) {
        int len = str.length();
        if (str == null || len == 0)
            return 0;
        int res = 0;
        boolean negative = false;
        int limit = -Integer.MAX_VALUE;
        int i = 0;
        char firstChar = str.charAt(0);
        if (firstChar < '0') {
            if (firstChar == '-') {
                negative = true;
                limit = Integer.MIN_VALUE;
            } else if (firstChar != '+')
                return 0;
            if (len == 1)
                return 0;
            i++;
        }
        int multmin = limit / 10;
        while (i < len) {
            int digit = str.charAt(i++) - '0';
            if (digit < 0 || digit > 9)
                return 0;
            if (res < multmin)
                return 0;
            res *= 10;
            if (res < limit + digit)
                return 0;
            res -= digit;
        }
        return negative ? res : -res;
    }
}
