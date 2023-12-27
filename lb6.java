public class lb6 {
    public static class lb6_2 {
        public static void main(String[] args) {
            String sentence = "The user with the nickname koala757677 this month wrote 3 times more comments than the user with the nickname croco181dile920 4 months ago";

            String result = capitalizeWords(sentence);
            System.out.println("Результат: " + result);
        }

        public static String capitalizeWords(String input) {
            if (input == null || input.isEmpty()) {
                throw new IllegalArgumentException("Рядок не може бути порожнім або нульовим");
            }

            String[] words = input.split("\\s+");

            for (int i = 0; i < words.length; i++) {

                words[i] = words[i].toUpperCase();
            }


            return String.join(" ", words);
        }
    }

    public static class lb6_1 {

        public static String intToBinaryString(int i) {
            return Integer.toBinaryString(i);
        }

        public static void main(String[] args) {
            int number = 21;
            String binaryString = intToBinaryString(number);
            System.out.println("Decimal: " + number);
            System.out.println("Binary: " + binaryString);
        }
    }
}
