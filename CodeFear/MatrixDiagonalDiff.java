package CodeFear;

public class MatrixDiagonalDiff {
    public static int difference(int [][] a,int n){

        int f_d=0;
        int s_d=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){

                if(i==j){
                    f_d+=a[i][j];
                }
                if(i==n-j-1){
                    s_d+=a[i][j];
                }
            }
        }
        return Math.abs(f_d-s_d) ;
    }
    public static void main(String[] args) {
        int n = 3;

        int arr[][] =
                {
                        {11, 2, 4},
                        {4 , 5, 6},
                        {10, 8, -12}
                };

        System.out.print(difference(arr, n));
    }
}
