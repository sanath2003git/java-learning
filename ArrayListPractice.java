import java.util.ArrayList;
public class ArrayListPractice {
    public static void main(String[] args){

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        numbers.set(2, 35);
        numbers.remove(1);
        
        int sum = 0;
        for(int i = 0; i < numbers.size(); i++){
            sum+= numbers.get(i);
        }
        System.out.println("Numbers: " + numbers);
        System.out.println("Sum: " + sum);
        System.out.println("40 exists: " + numbers.contains(40));
    }
}
