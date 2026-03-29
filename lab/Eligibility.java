import java.util.Scanner;

class Eligibility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter attendance (%): ");
        double attendance = sc.nextDouble();

        System.out.print("Enter internal marks: ");
        int marks = sc.nextInt();

        // Check voting eligibility
        if (age >= 18)
            System.out.println("Eligible to vote");
        else
            System.out.println("Not eligible to vote");

        // Check exam eligibility
        if (attendance >= 75 && marks >= 40)
            System.out.println("Eligible to write exam");
        else
            System.out.println("Not eligible to write exam");
        sc.close();
    }
}