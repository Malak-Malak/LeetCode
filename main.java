import java.util.*;
public class main {
    public static void main(String[] args) {
        lc2106 solve=new lc2106();
        Scanner in = new Scanner(System.in);
        System.out.println("enter n them m");
        int n=in.nextInt();
        int m=in.nextInt();
        int matrix [][] = new int [n][m];
        System.out.println("fill the matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=in.nextInt();
            }
        }
        System.out.println("enter pos then k");
        int pos=in.nextInt();
        int k=in.nextInt();
        System.out.println(solve.maxTotalFruits(matrix, pos, k));
    }
}
