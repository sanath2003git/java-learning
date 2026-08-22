public class MethodOverloadingPractice {
    public static int multiply(int a, int b){
        return a*b;
    }
    public static int multiply(int a, int b, int c){
        return a*b*c;
    }
    public static void main(String[] args) {
        int result = multiply(5, 4);
        System.out.println(result);
        result = multiply(2, 3, 4);
        System.out.println(result);
    }
}
