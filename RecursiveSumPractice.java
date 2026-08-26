public class RecursiveSumPractice {
    public static int recursiveSum(int n){
        if (n == 0) {
            return 0;
        }
        return n + recursiveSum(n - 1);
    }
    public static void main(String[] args) {
        int result = recursiveSum(5);
        System.out.println(result);
    }
}
