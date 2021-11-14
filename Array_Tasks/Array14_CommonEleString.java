public class Array14_CommonEleString {
        public void printArr(String[] arr){
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        public void commonElement(String [] arr1 , String[] arr2){
            for (int i = 0; i < arr1.length ; i++) {
                for (int j = 0; j < arr2.length; j++) {
                    if (arr1[i].equals(arr2[j])){
                        System.out.println("Common element in array :"+arr1[i]);
                    }
                }
            }
        }

        public static void main(String[] args) {
           String[] arr1 = {"a","b","c","d","e"};
           String[] arr2 = {"a","e","i","o","u"};
            Array14_CommonEleString obj = new Array14_CommonEleString();
            obj.printArr(arr1);
            System.out.println("");
            obj.printArr(arr2);
            System.out.println("");
            obj.commonElement(arr1,arr2);
        }


}
