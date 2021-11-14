import java.util.Arrays;

public class ExampleArray {
    public static void main(String[] args) {
        int [] a={10,50,30,20};

        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+" ");
        }
        Arrays.sort(a,2,4);
        System.out.println();
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+" ");
        }

        Arrays.sort(a);
        System.out.println();
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+" ");
        }
        int x=Arrays.binarySearch(a,20);
        System.out.println(x);

    }
}
