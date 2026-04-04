import java.util.Scanner;

class Employee {
    int eNo;
    String eName;
    double eSalary;

    void readData(Scanner sc) {
        System.out.print("Enter Employee No: ");
        eNo = sc.nextInt();

        System.out.print("Enter Employee Name: ");
        sc.nextLine(); // clear buffer
        eName = sc.nextLine();

        System.out.print("Enter Salary: ");
        eSalary = sc.nextDouble();
    }

    void display() {
        System.out.println("Employee No: " + eNo);
        System.out.println("Name: " + eName);
        System.out.println("Salary: " + eSalary);
    }
}

class EmployeeSearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        Employee[] emp = new Employee[n]; // Array of objects

        // Input
        for (int i = 0; i < n; i++) {
            emp[i] = new Employee(); // create object
            emp[i].readData(sc);
        }

        // Search
        System.out.print("Enter employee number to search: ");
        int searchNo = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (emp[i].eNo == searchNo) {
                System.out.println("\nEmployee Found:");
                emp[i].display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee not found");
        }

        sc.close();
    }
}