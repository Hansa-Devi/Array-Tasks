import java.util.Arrays;

public class Array58_SortTwoArray {
    public static void sortTwoArr(int [] A , int [] B){
        if (A.length < 0|| B.length < 0){
            return;
        }
       Arrays.sort(A);
       Arrays.sort(B);
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length ; j++) {
                if (A[i] > B[j]){
                    int temp = A[i];
                    A[i] = B[j];
                    B[j] = temp;
                }
            }
        }
        Arrays.sort(A);
        Arrays.sort(B);
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));
    }

    public static void main(String[] args) {
        int [] A = {1, 5, 6, 7, 8, 10 };
        int [] B = { 2, 4, 9};
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));
        sortTwoArr(A , B);

    }
}
