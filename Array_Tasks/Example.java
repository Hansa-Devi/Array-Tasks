import java.util.*;
public class Example {
    public static void main(String[] args) {
       Vector v = new Vector();
        v.add(20);
       v.add(50);
       v.add(10);
        System.out.println(v);
        Collections.reverse(v);
        System.out.println(v);
        Collections.sort(v);
        System.out.println(v);
        int x = Collections.binarySearch(v,20);
        System.out.println(x);
    }
}
