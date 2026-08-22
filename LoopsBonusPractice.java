public class LoopsBonusPractice {
    public static void main(String[] args) {

        // 1. Use do-while to print 1 to 5
        System.out.println("1.");
        int i=1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i<6);
        System.out.println();


        // 2. Print 1 to 10, but stop when reaching 7 using break
        System.out.println("2.");
        for (int n=1; n<=10; n++){
            if (n==7){
                break;
            }
            System.out.print(n + " ");
        }
        System.out.println();

        // 3. Use nested loops to print:
        // 1 2 3
        // 1 2 3
        // 1 2 3
        System.out.println("3.");
        for(int m=1; m<=3; m++){
            for(int n=1; n<=3; n++){
                System.out.print(n + " ");
            }
            System.out.println();
        }


    }
}