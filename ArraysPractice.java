public class ArraysPractice {

    public static void main(String[] args) {
        int[] numbers= {12,5,30,8,20};
        // Print all elements on one line
        System.out.println("1.");
        for(int i=0; i<numbers.length; i++ ){
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        // Find and print the sum
        System.out.println("2.");
        int sum =0;
        for(int i=0; i<numbers.length; i++ ){
            sum += numbers[i];
        }
        System.out.println("sum: " + sum);
        System.out.println();

        // Find and print the largest number
        System.out.println("3.");
        int max =numbers[0];
        for(int i=1; i<numbers.length; i++ ){
            if(max<numbers[i]){
                max=numbers[i];
            }
        }
        System.out.println("Largest:" + max );
        System.out.println();
        // Find and print the smallest number
        System.out.println("4.");
        int min =numbers[0];
        for(int i=1; i<numbers.length; i++ ){
            if(min>numbers[i]){
                min=numbers[i];
            }
        }
        System.out.println("Smallest:" + min );
        System.out.println();
        // Check whether 20 exists in the array
        System.out.println("5.");
        boolean found= false;
        for(int i=0; i<numbers.length; i++ ){
            if(numbers[i]==20){
                found= true;
                break;
            }
        }
        if (found) {
            System.out.println("20 found");
        }
        else{
            System.out.println("20 not found");
        }
    }
    
}
