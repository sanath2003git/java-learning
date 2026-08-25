public class LinearSearchPractice{
    public static int linearSearch(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }

        }
        return -1;
    }
    public static void main(String[] args){

        int[] numbers = {12, 5, 30, 8, 20};
        int n = 30;
        int index = linearSearch(numbers, n);
        System.out.println(index);
    }
}