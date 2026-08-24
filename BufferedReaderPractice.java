import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class BufferedReaderPractice {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter array size: ");
        int n = Integer.parseInt(br.readLine());
        System.out.println();
        System.out.print("Enter " + n + " elements: ");
        StringTokenizer st= new StringTokenizer(br.readLine()); 
        int[] arr = new int[n] ;
        int sum = 0;
        int max = 0;
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken()) ;
            if (i == 0) {
                max = arr[i];
            }
            sum+= arr[i];

            if(arr[i]>max){
                max= arr[i];
            }
            
        }
        System.out.print("Numbers: ");
        
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Sum: " + sum);
        System.out.println("Maximum: " + max);
    }
}
