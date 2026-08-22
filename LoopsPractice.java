public class LoopsPractice {
    public static void main(String[] args) {

        // 1. Print 1 to 10
        System.out.println("Print 1 to 10");

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();


        // 2. Print even numbers from 1 to 20
        System.out.println("\nPrint even numbers from 1 to 20");

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();


        // 3. Find sum from 1 to 100
        System.out.println("\nFind sum from 1 to 100");

        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += i;
        }

        System.out.print("Sum: " + sum);
        System.out.println();


        // 4. Print 10 down to 1 using while
        System.out.println("\nPrint 10 down to 1 using while");

        int i = 10;

        while (i > 0) {
            System.out.print(i + " ");
            i--;
        }
        System.out.println();


        // 5. Print 1 to 10, skipping 5 using continue
        System.out.println("\nPrint 1 to 10, skipping 5 using continue");

        for (int n = 1; n <= 10; n++) {
            if (n == 5) {
                continue;
            }

            System.out.print(n + " ");
        }
    }
}