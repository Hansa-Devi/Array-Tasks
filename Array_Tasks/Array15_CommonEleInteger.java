public class Array15_CommonEleInteger {
    public void printArr(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public void commonElement(int [] arr1 , int [] arr2){
        for (int i = 0; i < arr1.length ; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i]==arr2[j]){
                    System.out.println("Common element in array :"+arr1[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,4,6,8,10};
        Array15_CommonEleInteger obj = new Array15_CommonEleInteger();
        obj.printArr(arr1);
        System.out.println("");
        obj.printArr(arr2);
        System.out.println("");
        obj.commonElement(arr1,arr2);
    }
}
