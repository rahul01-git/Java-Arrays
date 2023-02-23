import java.util.Random;

public class Array {
    public static void main(String[] args) {
        // int[] x; //this one won't work
        // int[] x = new int[3];
        // int[] y = {10,20,30};
        // System.out.println(y[0]);

        // int[] x = new int[10];
        // for(int i = 0;i<x.length;i++){
        // Random random = new Random();
        // // generate 10 random values upto 10 and store it to array
        // int n = random.nextInt(10);
        // x[i] = n;
        // }

        // for (int y : x) {
        // System.out.println(y);
        // }

        // 2D Array
        int[][] x = { { 10, 20, 30 },
                { 20, 30, 40 },
                { 50, 60, 70 } };
        
        // // System.out.println(x[1][1]);

        //NOTE: using for 
        for(int i = 0; i< x.length;i++){
            for(int j = 0;j<x.length;j++){
                System.out.println(x[i][j]);
            }
        }

        //NOTE: using foreach
        // for (int[] y  : x) {
        //     for (int z : y) {
        //         System.out.println(z);
        //     }
        // }
    }
}

