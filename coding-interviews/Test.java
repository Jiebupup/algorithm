public class Test {
    public void print1ToMaxOfNDigits(int n) {
        if (n <= 0)
            return;
        char[] array = new char[n];
        print1ToMaxOfNDigits(array, 0);
    }

    private void print1ToMaxOfNDigits(char[] array, int idx) {
        if (idx == array.length) {
            print(array);
            return;
        }
        for (int i = 0; i < 10; i++) {
            array[idx] = (char) (i + '0');
            print1ToMaxOfNDigits(array, idx + 1);
        }
    }

    private void print(char[] array) {
        int tmp = 0;
        while (tmp < array.length && array[tmp] == '0') {
            tmp++;
        }
        while (tmp < array.length) {
            System.out.print(array[tmp++]);
        }
        System.out.println();
    }
}
