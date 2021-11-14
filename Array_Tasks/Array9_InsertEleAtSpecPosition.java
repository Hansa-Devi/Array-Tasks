public class Array9_InsertEleAtSpecPosition {
    public void insertAtPosition(int []a , int index , int ele){
           if (a.length<=0){
               return ;
           }
        for (int i = a.length-1; i >index ; i--) {
            a[i]=a[i-1];
        }
            a[index]=ele;
        }

    public void printArray(int [] arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }


    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5};
        Array9_InsertEleAtSpecPosition o = new Array9_InsertEleAtSpecPosition();
        o.printArray(arr);
        System.out.println("");
        o.insertAtPosition(arr , 0 , 0);
        o.printArray(arr);
    }
}
