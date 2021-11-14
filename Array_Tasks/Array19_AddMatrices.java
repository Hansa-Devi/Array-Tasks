import java.util.Arrays;
public class Array19_AddMatrices {

    public void print2DArray(int [][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void addMatrices(int[][] arr1 , int[][] arr2 ){
        int row = arr1.length;
        int col = arr1[0].length;
        int [][] arrSum = new int[row][col];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arrSum[i][j] = arr1[i][j]+arr2[i][j];
            }
        }
//        System.out.println("Sum of Arrays:"+Arrays.deepToString(arrSum));
        System.out.println("Sum of Arrays:");
        print2DArray(arrSum);
    }

    public static void main(String[] args) {
        int [][] matrix1 = {{1,2,3},{4,5,6}};
        int [][] matrix2 = {{1,0,1},{1,0,1}};
        Array19_AddMatrices obj = new Array19_AddMatrices();
//        System.out.print("Matrix1:"+ Arrays.deepToString(matrix1));
//        System.out.println("");
//        System.out.print("Matrix2:"+ Arrays.deepToString(matrix2));
//        System.out.println("");
        System.out.println("Matrix 1:");
          obj.print2DArray(matrix1);
        System.out.println("Matrix 2:");
          obj.print2DArray(matrix2);
         obj.addMatrices(matrix1,matrix2);

    }
}
