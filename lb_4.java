import java.util.Arrays;
import java.util.Random;

public class lb_4 {
    public static class lb4_3 {

            public static void main(String[] args) {
                // Задаємо розмір масивів A та B
                int n = 5;

                // Створюємо та заповнюємо масиви A та B
                int[] A = {1, 2, 3, 4, 5};
                int[] B = {6, 7, 8, 9, 10};

                // Виводимо масиви A та B
                System.out.println("Масив A: " + Arrays.toString(A));
                System.out.println("Масив B: " + Arrays.toString(B));

                // Створюємо масив C(2*n) та заповнюємо його елементами з A та B
                int[] C = mergeArrays(A, B);

                // Виводимо масив C
                System.out.println("Масив C: " + Arrays.toString(C));
            }

            // Метод для об'єднання масивів A та B у масив C
            private static int[] mergeArrays(int[] A, int[] B) {
                int[] C = new int[A.length + B.length];

                for (int i = 0, j = 0, k = 0; i < A.length || j < B.length; i++, j++) {
                    if (i < A.length) {
                        C[k++] = A[i];
                    }
                    if (j < B.length) {
                        C[k++] = B[j];
                    }
                }

                return C;
            }
        }

    public static class lb4_2 {
        public static void main(String[] args) {
            // Задаємо розмір масиву
            int size = 50;

            // Створюємо масив
            int[] array = new int[size];

            // Наповнюємо масив випадковими елементами
            fillArray(array);

            // Виводимо масив
            System.out.println("Елементи масиву:");
            printArray(array);

            // Знаходимо та виводимо найбільший кратник 7
            findAndPrintMaxMultipleOf7(array);
        }

        // Метод для наповнення масиву випадковими елементами
        private static void fillArray(int[] array) {
            Random random = new Random();
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(100); // Генеруємо випадкове число в межах [0, 100)
            }
        }

        // Метод для виведення елементів масиву
        private static void printArray(int[] array) {
            for (int element : array) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        // Метод для знаходження та виведення найбільшого кратника 7
        private static void findAndPrintMaxMultipleOf7(int[] array) {
            int maxMultipleOf7 = Integer.MIN_VALUE;

            for (int element : array) {
                if (element % 7 == 0 && Math.abs(element) > Math.abs(maxMultipleOf7)) {
                    maxMultipleOf7 = element;
                }
            }

            if (maxMultipleOf7 != Integer.MIN_VALUE) {
                System.out.println("Найбільший кратник 7: " + maxMultipleOf7);
            } else {
                System.out.println("У масиві немає елементів, кратних 7.");
            }
        }
    }

    public static class lb4_1 {
        public static void main(String[] args) {
            int[] array = {1, -3, 5, -7, 2, 4, 6};

            int maxNegative = Integer.MIN_VALUE;
            int minEven = Integer.MAX_VALUE;

            for (int element : array) {
                if (element < 0 && element > maxNegative) {
                    maxNegative = element;
                } else if (element % 2 == 0 && element < minEven) {
                    minEven = element;
                }
            }

            if (maxNegative != Integer.MIN_VALUE && minEven != Integer.MAX_VALUE) {
                int result = Math.abs(maxNegative) * Math.abs(minEven);
                System.out.println("Добуток модулів найбільшого від'ємного та найменшого парного елементів: " + result);
            } else {
                System.out.println("Не вдалося знайти від'ємний та парний елементи у масиві.");
            }
        }
    }
}
