import java.util.Arrays;

public class TestSortPrimitiveType {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 0, 3, 4, 5, 6, 5, 8, 9, 10};
        SortAlgo sortAlgo = new SortAlgo();
        sortAlgo.quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
