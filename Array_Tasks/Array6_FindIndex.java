public class Array6_FindIndex {
    public void indexOdEle(int []a, int ele){
        boolean b = true;
        for (int i = 0; i < a.length; i ++){
            if (a[i] == ele){
                System.out.println(i);
                b = false;
                break;
            }
        }
        if (b)
            System.out.println("not exists");
    }
    public static void main(String[] args) {
        Array6_FindIndex f = new Array6_FindIndex();
        int [] a = {10,20,30,40};
        f.indexOdEle(a,50);
    }
}
