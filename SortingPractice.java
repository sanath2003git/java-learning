import java.util.Arrays;
public class SortingPractice {
    public static void main(String[] args) {
        int[] numbers = {45, 12, 78, 3, 56, 23};
        System.out.print("Original: ");
        for(int number : numbers){
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.print("Sorted: ");
        Arrays.sort(numbers);
        for(int number : numbers){
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println("Min: " + numbers[0]);
        System.out.println("Max: " + numbers[numbers.length-1]);
    }
}