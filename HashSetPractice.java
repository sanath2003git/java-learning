import java.util.HashSet;
public class HashSetPractice{
    public static void main(String[] args){
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);
        numbers.add(10);
        System.out.println(numbers);
        System.out.println("30 exists: " + numbers.contains(30));
        numbers.remove(20);
        System.out.println(numbers);
        System.out.println("Size: " + numbers.size());
        int sum = 0;
        for(int number : numbers){
            sum += number;
        }
        System.out.println("Sum: " + sum);
    }
}