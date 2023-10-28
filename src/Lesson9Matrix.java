import java.util.Arrays;

public class Lesson9Matrix {
    static final int MATRIX_SIZE = 8;

    private static void fillArray(int[] arr, boolean reverse) {
        if (arr == null)
            return;
        int n;
        if (!reverse)
            n = 1;
        else
            n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = reverse ? n-- : n++;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = new int[MATRIX_SIZE][MATRIX_SIZE];

        for (int i = 0; i < matrix.length; i++) {
            fillArray(matrix[i], (i+1) % 2 == 0);
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

}
