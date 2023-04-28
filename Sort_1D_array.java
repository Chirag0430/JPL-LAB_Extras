public class Sort_1D_array {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 12, 1, 7};
        int n = array.length;

        // Perform bubble sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j+1]) {
                    // Swap the elements
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        // Print the sorted array
        System.out.print("Sorted Array (Ascending order): ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
