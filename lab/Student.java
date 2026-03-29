import java.util.Scanner;

class Student {
    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Input student details
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        int roll = sc.nextInt();

        // Input marks
        System.out.println("Enter marks of 5 subjects:");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int m4 = sc.nextInt();
        int m5 = sc.nextInt();

        // Calculation
        int total = m1 + m2 + m3 + m4 + m5;
        double average = total / 5.0;
        double percentage = average;

        // Output
        System.out.println("\n--- Result ---");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Percentage: " + percentage);
        sc.close();
    }
}