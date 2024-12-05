public class QuickSort {
    public void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(int[] array, int start, int end) {
        if (start < end) {
            int pivotIndex = partition(array, start, end);
            quickSort(array, start, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, end);
        }
    }

    private int partition(int[] array, int start, int end) {
        int pivot = array[start];
        int left = start + 1;
        int right = end;

        while (left <= right) {
            while (left <= end && array[left] <= pivot) {
                left++;
            }
            while (right >= start && array[right] > pivot) {
                right--;
            }
            if (left < right) {
                swap(array, left, right);
            }
        }
        swap(array, start, right);
        return right;
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
