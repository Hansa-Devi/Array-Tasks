import java.util.ArrayList;
import java.util.Arrays;

public class Array20_ConvertArrayToArraylist {
    public static void main(String[] args) {
        Integer [] arr = {1 ,2, 3, 4, 5};
        ArrayList<Integer> integers = new ArrayList<Integer>(Arrays.asList(arr));
        System.out.println(integers);
    }
}
