public class Order {

    private OrderItem[] items;

    public Order(OrderItem[] items) {
        this.items = items;
    }

    public void selectionSort() {
        for (int i = 0; i < items.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < items.length; j++) {
                if (items[minPos].compareTo(items[j]) > 0) {
                    minPos = j;
                }
            }
            swap(items, minPos, i);
        }
    }

    public void swap(OrderItem[] array, int i, int j) {
        OrderItem temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (OrderItem orderItem : items) {
            str.append(orderItem.toString()).append("\n");
        }
        return str.toString();
    }

    public void bubbleSort() {
        boolean isSorted = true;
        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items.length - 1 - i; j++) {
                if (items[j].compareTo(items[j + 1]) > 0) {
                    isSorted = false;
                    swap(items, j, j + 1);
                }
            }
            if (isSorted) break;
        }
    }

    public void insertionSort() {
        for (int i = 1; i < items.length; i++) {
            OrderItem ai = items[i];
            int j = i;
            while (j > 0 && items[j - 1].compareTo(ai) > 0) {
                items[j] = items[j - 1];
                j--;
            }
            items[j] = ai;
        }
    }
}
