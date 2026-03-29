import java.util.Scanner;

class Employee {
    public static void main(String[] args) {

        // Scanner for input
        Scanner sc = new Scanner(System.in);

        // Input details
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        System.out.print("Enter HRA: ");
        double hra = sc.nextDouble();

        System.out.print("Enter DA: ");
        double da = sc.nextDouble();

        // Calculations
        double gross = basic + hra + da;
        double pf = 0.12 * basic;   // 12% PF
        double net = gross - pf;

        // Output
        System.out.println("\n--- Salary Details ---");
        System.out.println("Employee ID: " + id);
        System.out.println("Gross Salary: " + gross);
        System.out.println("PF Deduction: " + pf);
        System.out.println("Net Salary: " + net);
        sc.close();
    }
}