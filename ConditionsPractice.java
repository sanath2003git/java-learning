public class ConditionsPractice {
    public static void main(String[] args) {

        int number = 15;

        if (number > 0) {
            if (number % 2 == 0) {
                System.out.println(number + " -> Positive and Even");
            } else {
                System.out.println(number + " -> Positive and Odd");
            }

        } else if (number < 0) {
            System.out.println(number + " -> Negative");

        } else {
            System.out.println(number + " -> Zero");
        }
    }
}