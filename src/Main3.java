import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        //Implement a method that makes a given array in reverse order.
        //It’s look like previousbut you should solve it without new array{10, 3, 3, 5, -9} -> {-9, 5, 3, 3, 10}

        int[] array = {10, 3, 3, 5, -9};
        System.out.println(Arrays.toString(array));
        revArray(array);
        System.out.println(Arrays.toString(array));


    }

    private static void revArray(int[] array) {
        int temp;
        int n = array.length;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[n - i - 1];
            array[n - i - 1] = array[i];
            array[i] = temp;
        }
    }
}



