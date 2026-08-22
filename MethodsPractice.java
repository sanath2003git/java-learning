public class MethodsPractice {

    // 1. greet()
    public static void greet() {
        System.out.println("Welcome to Java Methods");
    }


    // 2. printSquare(int n)
    public static void printSquare(int n) {
        System.out.println(n*n);
    }


    // 3. add(int a, int b)
    public static int add(int a, int b) {

        return a + b;
    }


    // 4. isEven(int n)
    public static boolean isEven(int n) {
    return n % 2 == 0;
}


    public static void main(String[] args) {

        greet();

        printSquare(5);


        int sum= add(10, 20);
        System.out.println(sum);


        if(isEven(10)){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }


    }
}