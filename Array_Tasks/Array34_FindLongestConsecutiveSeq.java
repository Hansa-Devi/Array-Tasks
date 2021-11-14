import java.util.Arrays;

public class Array34_FindLongestConsecutiveSeq {
    public static void sequence(int[] array){
        int num = 0;
        int counter = 1;
        int seq1;
        int seq2;
        int seq3;

        for (int i = 0; i < array.length; i++) {
            num = array[i];
            num++;
            for (int j = 0; j < array.length; j++) {
                System.out.println();
                if (array[j] == num){
                    counter++;
                }
            }
        }
        System.out.println("Length of array"+counter);
    }

    public static void main(String[] args) {
        int[] array = {49, 1, 3, 200, 2, 4, 70, 5};
        sequence(array);

    }
//    public  static void findLongConsecutiveSeq(int [] arr){
//        if (arr.length <= 0)
//            return;
//        Arrays.sort(arr);
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if ((arr[i] + 1 ) == arr[i+1]){
//                count ++;
//            }
//        }
//        for (int i = 0; i < count ; i++) {
//            System.out.println(arr[i] + " ");
//        }
//    }
//    public static void main(String[] args) {
//        int [] arr = {49, 1, 3, 200, 2, 4, 70, 5};
//        System.out.println(Arrays.toString(arr));
//        findLongConsecutiveSeq(arr);
//    }
}
