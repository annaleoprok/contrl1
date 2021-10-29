public class two {
    static int[] fillArray(int[] array) {
        int length = array.length;

        for (int i = 0; i < length; i++) {
            array[i] = i * 3;
        }
        return array;
    }
}
