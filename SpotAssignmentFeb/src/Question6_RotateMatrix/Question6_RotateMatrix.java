package Question6_RotateMatrix;

public class Question6_RotateMatrix {
    public static void main(String[] args) {
        int [][] OriginalMatrix = {{1,2,3},{4,5,6},{7,8,9}};
        int n=OriginalMatrix.length;
        int [][] rightRotated = rightRotateThreeTimes(OriginalMatrix,n);

        System.out.println("Original matrix is:");
        display(OriginalMatrix,n);

        System.out.println();

        System.out.println("Three times right rotated matrix is:");
        display(rightRotated,n);
    }

    public static int[][] rightRotateThreeTimes(int[][] OriginalMatrix,int n){
        int[][] rightRotated = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               rightRotated[i][j]=OriginalMatrix[j][n-1-i];
            }
        }

        return rightRotated;
    }

    public static void display(int[][]matrix,int n){
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
