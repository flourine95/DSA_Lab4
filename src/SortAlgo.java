import java.util.Arrays;

public class SortAlgo {
    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 1, 0};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // sort by descending order
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minPos] > array[j]) {
                    minPos = j;
                }
            }
            swap(array, minPos, i);
        }
    }
    public static void selectionSort(Order[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minPos] > array[j]) {
                    minPos = j;
                }
            }
            swap(array, minPos, i);
        }
    }

    // sort by descending order
    public static void bubbleSort(int[] array) {
        boolean isSorted = true;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    isSorted = false;
                    swap(array, j, j + 1);
                }
            }
            if (isSorted) break;
        }
    }
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int ai = array[i];
            int j = i;
            while (j > 0 && array[j-1] > ai){
                array[j] = array[j-1];
                j--;
            }
            array[j] = ai;
        }
    }


    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


}
