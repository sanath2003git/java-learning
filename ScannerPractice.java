import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Read name
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // 2. Read age
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // 3. Read n
        System.out.print("Enter array size: ");
        int n = sc.nextInt(); 

        // 4. Create an array
        int[] arr = new int[n];

        // 5. Read n integers
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        // 6. Print name
        System.out.println("Name: " + name);

        // 7. Print age
        System.out.println("Age: " + age);

        // 8. Print numbers
        System.out.print("Numbers: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();


        // 9. Find and print sum
        int sum=0;
        for(int i=0; i<n; i++){
            sum += arr[i];
        }
        System.out.println("Sum: " + sum);


        sc.close();
    }
}