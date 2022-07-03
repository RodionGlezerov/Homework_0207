import java.util.Arrays;

public class Main4 {
    public static void main(String[] args) {
        //Assume that there are two arrays of numbers,
        // each sorted in ascending order. Implement the method int[] merge(int[], int[])
        // that marge these arrays into
        // a single sorted array.({1,4,6,8},{3,7}) ->{1,3,4,6,7,8}({12,19},{3,7}) ->{3,7,12,19}
        int[] a = {1, 4, 6, 8};
        int[] b = {3, 7};
        int[] c = new int[a.length + b.length];
        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);
        System.out.println(Arrays.toString(c));
        bubbleSort(c);
        System.out.println(Arrays.toString(c));
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int t = array[i];
                    array[i] = array[j];
                    array[j] = t;
                }
            }
        }
    }
}
