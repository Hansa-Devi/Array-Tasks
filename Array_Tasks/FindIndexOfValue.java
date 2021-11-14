public class FindIndexOfValue {
    public void contains(int[] array, int item){
        boolean b = true;
        for (int i = 0; i < array.length; i ++){
            if (array[i] == item){
                System.out.println(i);
                break;
            }
            else if
                (array[i] != item) {
                System.out.println("Not Exists");

            }
        }

    }
    public static void main(String[] args) {
        FindIndexOfValue f = new FindIndexOfValue();
        int[] array1 = {3, 4, 5, 9, 1};
        f.contains(array1, 5);



    }
}