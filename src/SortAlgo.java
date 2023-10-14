import java.util.Arrays;
import java.util.Random;

public class SortAlgo {

    // sort by descending order
    public void selectionSort(int[] array) {
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

    public void selectionSort(Order order) {
        order.selectionSort();
    }

    // sort by descending order
    public void bubbleSort(int[] array) {
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

    public void bubbleSort(Order order) {
        order.bubbleSort();
    }

    public void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int ai = array[i];
            int j = i;
            while (j > 0 && array[j - 1] > ai) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = ai;
        }
    }

    public void insertSort(Order order) {
        order.insertionSort();
    }

    public void mergeSort(int[] array) {
        if (array.length <= 1) {
            return;
        }
        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);
        mergeSort(left);
        mergeSort(right);
        merge(left, right, array);
    }

    private void merge(int[] left, int[] right, int[] array) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        while (i < left.length) {
            array[k++] = left[i++];
        }

        while (j < right.length) {
            array[k++] = right[j++];
        }
    }

    public void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivot = array[low];
            int i = partition(array, low, high, pivot);
            quickSort(array, low, i - 1);
            quickSort(array, i + 1, high);
        }
    }

    private int partition(int[] array, int low, int high, int pivot) {
        for (int i = low + 1; i <= high; i++) {
            if (array[i] < pivot) {
                swap(array, i, low);
                low++;
            }
        }
        return low;
    }

    private int getPivot_MedianOfThree(int[] array) {
        return 0;
    }

    // select pivot element based on the first element in the array
    private static int getPivot_First(int[] array) {
        return array[0];
    }

    // select pivot element based on the last element in the array
    private static int getPivot_Last(int[] array) {
        return array[array.length - 1];
    }

    // select pivot element based on choosing a randomly element in the array
    private static int getPivot_Random(int[] array) {
        return array[new Random().nextInt(array.length)];
    }

    public void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
