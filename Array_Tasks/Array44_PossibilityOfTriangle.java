import java.util.Arrays;

public class Array44_PossibilityOfTriangle {
    public static void possibilityOfTriangle(int [] a){
        int count=0;
        if (a.length < 3){
            System.out.println("Invalid Array");
            return;
        }
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                for (int k = j+1; k < a.length; k++) {
                    if (a[i] + a[j] > a[k]){
                        count++;
                    }
                    else {
                        break;
                    }
                }
            }
        }
        System.out.println("possible Triangle in Array are: "+count);
    }

    public static void main(String[] args) {
        int [] arr = {6, 7, 9, 16, 25, 12, 30, 40};
        System.out.println(Arrays.toString(arr));
        possibilityOfTriangle(arr);
    }
}
