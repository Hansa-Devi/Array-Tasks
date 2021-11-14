public class Array10_FindMaxMin {
//    public void printArr(int [] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//    }
//
//    public void findMAxMin(int [] arr){
//        if (arr.length <= 0){
//            return;
//        }
//        for (int i = 0; i < arr.length-1; i++) {
//            for (int j = 0; j <arr.length-1-i ; j++) {
//                if (arr[j] > arr[j+1]){
//                    int x = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = x;
//                }
//            }
//        }
//        System.out.println("Min element of Array : "+arr[0]);
//        System.out.println("Maximum Elelment of Array: "+arr[arr.length-1]);
//    }
//
//    public static void main(String[] args) {
//        int [] arr ={2,5,1,3,4};
//    Array10_FindMaxMin obj = new Array10_FindMaxMin();
//        obj.printArr(arr);
//        System.out.println("");
//        obj.findMAxMin(arr);
//    }

    public static int maximumNo(int[] array){
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }

    public static int minimumNo(int[] array){
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }

    public static void main(String[] args) {
        int[] array = {0, 5, 10, 7, 8};
        System.out.println(maximumNo(array));
        System.out.println(minimumNo(array));
    }
}
