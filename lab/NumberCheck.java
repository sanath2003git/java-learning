import java.util.Scanner;

class NumberCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Positive or Negative
        if (num >= 0)
            System.out.println("Positive");
        else
            System.out.println("Negative");

        // Even or Odd
        if (num % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");

        // Divisible by 5 and 11
        if (num % 5 == 0 && num % 11 == 0)
            System.out.println("Divisible by both 5 and 11");
        else
            System.out.println("Not divisible by both 5 and 11");
        sc.close();
    }
}