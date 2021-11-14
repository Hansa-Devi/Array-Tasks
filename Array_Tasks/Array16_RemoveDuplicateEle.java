public class Array16_RemoveDuplicateEle {
    public void printArr(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
    public void removeDuplicateEle(int [] arr) {
        int len = arr.length;
        if (arr.length <= 0)
            return;
        for (int i = 0; i < len; i++) {
            for (int j = i+1; j < len; j++) {
                if (arr[i] == arr[j]) {
                  arr[j]=arr[len-1];
                  len--;
                  j--;
                }
            }
        }
            for (int i = 0; i < len; i++) {
                System.out.print(arr[i] + " ");
            }
    }

    public static void main(String[] args) {
        int [] arr ={1,2,4,2,6,7,2,7};
        Array16_RemoveDuplicateEle obj = new Array16_RemoveDuplicateEle();
        obj.printArr(arr);
        obj.removeDuplicateEle(arr);
    }
}
