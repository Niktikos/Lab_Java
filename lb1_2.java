public class lb1_2 {
    static void Task1() {
        double a = 3.56, b = 1.02, c = 3, d = 2.43;
        double y = Math.pow(Math.tan(Math.toRadians(a)), c) / (1 + Math.sinh(b) / Math.log(Math.abs(d + c)));
        System.out.println("Task 1: " + y);
    }

    static void Task2() {
        double a = 1.54, b = 0.49, c = 24.1, d = 0.87;
        double y = 2 * Math.sqrt(Math.sin(Math.toRadians(a)) / Math.abs(Math.tan(Math.toRadians(b - a)))) + Math.log(c) / d;
        System.out.println("Task 2: " + y);
    }

    static void Task3() {
        double a = 0.345, b = -2.25, c = 2.65, d = 3.99;
        double y = (Math.cos(Math.toRadians(b)) + Math.sin(Math.sqrt(a))) / (2 * (Math.log10(c) + Math.pow(Math.E, d)));
        System.out.println("Task 3: " + y);
    }

    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
    }
}