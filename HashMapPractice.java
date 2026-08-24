import java.util.HashMap;
public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<String,Integer> marks = new HashMap<>();
        marks.put("Alice",85);
        marks.put("Bob", 90);
        marks.put("Charlie", 78);
        marks.put("David",92);
        System.out.println("Bob's mark: " + marks.get("Bob"));
        marks.put("Charlie",82);
        System.out.println("Alice exists: " + marks.containsKey("Alice"));
        marks.remove("David");
        System.out.println(marks);
        int sum = 0;
        for(int mark : marks.values()){
            sum += mark;
        }
        System.out.println("Sum: " + sum);
    }
}
