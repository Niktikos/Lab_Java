import java.util.Arrays;

public class lb5 {
    public static class lb5_2 {
        public static void sort(float[] arr) {
            int n = arr.length;

            for (int i = 1; i < n; i++) {
                float key = arr[i];
                int j = i - 1;

                while (j >= 0 && arr[j] < key) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
                }

                arr[j + 1] = key;
            }
        }

        public static void main(String[] args) {
            float[] array = {4.5f, 2.1f, 8.3f, 1.7f, 6.2f};

            System.out.println("Original Array: " + Arrays.toString(array));
            sort(array);
            System.out.println("Sorted Array (Insertion Sort): " + Arrays.toString(array));
        }
    }

    public static class lb5_1 {
        public static void sort(float[] arr) {
            int n = arr.length;

            for (int i = 0; i < n - 1; i++) {
                int maxIndex = i;

                for (int j = i + 1; j < n; j++) {
                    if (arr[j] > arr[maxIndex]) {
                        maxIndex = j;
                    }
                }

                // Swap the found maximum element with the element at index i
                float temp = arr[maxIndex];
                arr[maxIndex] = arr[i];
                arr[i] = temp;
            }
        }

        public static void main(String[] args) {
            float[] array = {4.5f, 2.1f, 8.3f, 1.7f, 6.2f};

            System.out.println("Original Array: " + Arrays.toString(array));
            sort(array);
            System.out.println("Sorted Array (Selection Sort): " + Arrays.toString(array));
        }
    }
}
