public class Array7RemoveSpecific {
    public static int removeSpecElement(int[]a, int element){
        int index = element;
        for (int i = element; i <a.length-1 ; i++) {
           a[i] =a [i+1]     ;
        }
        for (int i = 0; i <a.length-1 ; i++) {
            System.out.print(a[i]+" ");
        }
      return -1;
    }

    public static void main(String[] args) {
    int [] arr={10,20,20,30,40,50};
        System.out.println("Original Array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        System.out.println("After Removing element");
      removeSpecElement(arr,2);
    }
}
