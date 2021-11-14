import java.util.Arrays;

public class Array25_FindCommonIn3SortedArray {

    public static void commonEle(int [] a1 , int [] a2, int [] a3){
        boolean common=false;
        if (a1.length <= 0 || a2.length <= 0 || a3.length <= 0)
            return;
        for (int i = 0; i < a1.length ; i++) {
            for (int j = 0; j < a2.length ; j++) {
                for (int k = 0; k < a3.length; k++) {
                    if (a1[i] == a2[j] && a2[j] == a3[k]){
                        System.out.println("Common element in Arrays : "+a1[i]);
                        common = true;
                    }
                }
            }
        }
        if(!common){
            System.out.println("No common element in 3 Arrays");
        }
    }
    public static void main(String[] args) {
        int [] integers = {3,1};
        int [] evenNum = {8,6,4,2};
        int [] primeNum = {11,7,5,3,2};
        Arrays.toString(integers);
        Arrays.toString(primeNum);
        Arrays.toString(evenNum);
        commonEle(integers, evenNum, primeNum);

    }
}
