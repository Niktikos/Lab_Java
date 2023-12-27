import java.util.Scanner;

public class lb3 {
    public static class lb3_1 {
        public lb3_1() {
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the value for t: ");
            double t = scanner.nextDouble();
            System.out.print("Enter the value for i: ");
            double i = scanner.nextDouble();
            double sum;
            int k;
            if (i == 1) {
                sum = Math.sqrt(t);

                System.out.println("Result: " + sum);
            } else if (i == 2) {
                sum = 0.0;
                sum = 1/Math.sqrt(t);

                System.out.println("Result: " + sum);

            } else if(i != 1 && i != 2){
                sum = 0.0;

                for(k = 1; k <= i; ++k) {
                    sum += k * t ;
                }
                System.out.println("Result: " + sum);
            }
            else {

                System.out.println("Looks like an error. t is not a number.");
            }

        }

        private static double calculateFunction2(double t, int i) {
            if (t * (double)i >= 0.0) {
                return Math.sqrt(t * (double)i);
            } else {
                System.out.println("Error: Cannot take the square root of a negative number.");
                return 0.0;
            }
        }
    }

    public static class lb3_2 {
        public lb3_2() {
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the value for a: ");
            double a = scanner.nextDouble();
            System.out.print("Enter the value for b: ");
            double b = scanner.nextDouble();
            double sum = 0.0;

            for(int i = 1; i <= 30; ++i) {
                sum += calculateFunction(a, b, i);
            }

            System.out.println("Result: " + sum);
        }

        private static double calculateFunction(double a, double b, int i) {
            return Math.sqrt(a * i * Math.sqrt(b / i));
        }
    }

    public static class lb3_3 {
        public lb3_3() {
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введіть значення для ε (ε > 0): ");
            double epsilon = scanner.nextDouble();
            if (epsilon <= 0.0) {
                throw new IllegalArgumentException("ε повинно бути більше за 0");
            } else {
                double sum = calculateInfiniteSum(epsilon);
                System.out.println("Результат: " + sum);
            }
        }

        public static double calculateInfiniteSum(double epsilon) {
            double sum = 0.0;
            int i = 0;
            double term;

            do {
                term = Math.pow(-2, i) / (factorial(i) * (i + 1));
                sum += term;
                i++;
            } while (Math.abs(term) >= epsilon);

            return sum;
        }

        public static int factorial(int n) {
            if (n == 0 || n == 1) {
                return 1;
            } else {
                return n * factorial(n - 1);
            }
        }
    }
}
