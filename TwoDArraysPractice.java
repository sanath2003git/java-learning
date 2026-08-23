public class TwoDArraysPractice {

    public static void main(String[]arggs){
        int[][] matrix={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        
        // 1. Print the entire matrix
        System.out.println("1.");
        System.out.println();
        for(int m=0 ; m < matrix.length; m++){
            for(int n=0; n<matrix[m].length; n++){
                System.out.print(matrix[m][n] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // 2.Find the sum of all elements
        System.out.println("2.");
        System.out.println();
        int sum =0;
        for(int m=0; m<matrix.length; m++){
            for(int n=0; n<matrix[m].length; n++){
                sum+=matrix[m][n];
            }
        }
        System.out.println("Sum:" + sum);
        System.out.println();

        // 3. Print only the second row
        System.out.println("3.");
        System.out.println();
        for (int n = 0; n < matrix[1].length; n++) {
            System.out.print(matrix[1][n] + " ");
        }
        System.out.println();

        // 4. Print only the first column
        System.out.println("4.");
        System.out.println();
        for (int m = 0; m < matrix.length; m++) {
            System.out.println(matrix[m][0]);
        }
        System.out.println();

        // 5. Find the largest element
        System.out.println("5.");
        System.out.println();
        int max = matrix[0][0];

        for (int m = 0; m < matrix.length; m++) {
            for (int n = 0; n < matrix[m].length; n++) {
                if (matrix[m][n] > max) {
                    max = matrix[m][n];
                }
            }
        }
        System.out.println(max);   
    }
    
}
