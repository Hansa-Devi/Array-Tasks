public class Array13_FindDuplicateString {
    public void printArr(String [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +  " ");
        }
    }
    public void findDuplicate(String [] arr){
        if (arr.length <= 0)
            return;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]){
                    System.out.println("Duplicate value :"+arr[i]+" at index : "+j);
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        String [] name = {"Hansa","Anjana","Hansa","koonj","Hansa","Rajeshwari","Hansa","Kumkum","Hansa"};
        Array13_FindDuplicateString obj = new Array13_FindDuplicateString();
        obj.printArr(name);
        System.out.println("");
        obj.findDuplicate(name);
    }
}
