public class three {
    static int[] multiplyLess6(int[] array) {
        int length = array.length;
        int tmp;

        for (int i = 0; i < length; i++) {
            tmp = array[i];
            array[i] = tmp < 6 ? tmp * 2 : tmp;
        }
        return array;
    }
}
