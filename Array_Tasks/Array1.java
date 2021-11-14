import java.util.Arrays;
//Java program to sort a numeric array and a string array
public class Array1 {
    public static void main(String[] args) {
        int [] arrnum={20,40,10,60,50};
        Arrays.sort(arrnum);
        for (int i = 0; i <arrnum.length ; i++) {
            System.out.print(arrnum[i]+" ");
        }
        String [] arrStr={"b","d","a","c"};
        Arrays.sort(arrStr);
        System.out.println();
        for (int i = 0; i <arrStr.length ; i++) {
            System.out.print(arrStr[i]+" ");
        }
    }
}
