// package javacodes;

// import java.math;
// import java.lang.reflect.Array;
public class RandomValue {
    public static void main(String[] args) {
        int arr[][] = new int[3][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = (int) (Math.random() * 10);
            }
        }

        // show elements
        for (int[] is : arr) {
            for (int is2 : is) {
                System.out.println(is2);
            }
        }
    }
}
