import java.util.Scanner;

// Interface 1
interface Loan {
    void calculateEMI(double amount, int years);
}

// Interface 2
interface Insurance {
    void calculateInsurance(double price);
}

// Vehicle class implementing interfaces
class Vehicle implements Loan, Insurance {

    String number, brand;
    double price;

    void addDetails(String number, String brand, double price) {
        this.number = number;
        this.brand = brand;
        this.price = price;
    }

    public void calculateEMI(double amount, int years) {
        double emi = (amount / (years * 12));
        System.out.println("Monthly EMI: " + emi);
    }

    public void calculateInsurance(double price) {
        double insurance = price * 0.05;
        System.out.println("Insurance Premium: " + insurance);
    }

    void display() {
        System.out.println("Vehicle No: " + number);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }
}

// Main Class
class VehicleDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Vehicle v = new Vehicle();

        int choice;

        do {
            System.out.println("\n1. Add Vehicle");
            System.out.println("2. Calculate EMI");
            System.out.println("3. Calculate Insurance");
            System.out.println("4. Display");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sc.nextLine(); // clear buffer
                    System.out.print("Enter Vehicle Number: ");
                    String num = sc.nextLine();

                    System.out.print("Enter Brand: ");
                    String brand = sc.nextLine();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    v.addDetails(num, brand, price);
                    break;

                case 2:
                    System.out.print("Enter Loan Amount: ");
                    double amt = sc.nextDouble();

                    System.out.print("Enter Years: ");
                    int years = sc.nextInt();

                    v.calculateEMI(amt, years);
                    break;

                case 3:
                    v.calculateInsurance(v.price);
                    break;

                case 4:
                    v.display();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;
            }

        } while (choice != 5);
        sc.close();
    }
}