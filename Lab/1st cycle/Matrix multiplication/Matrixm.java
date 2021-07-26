import java.io.*;
 
public class Matrixm
{
    public static void main(String args[]) throws IOException
    {
        int i,j,k,r1,c1,r2,c2;
        int[][] A,B,C;
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.println("Enter no of rows and columns of first matrix: ");
        r1 = Integer.parseInt(in.readLine());
        c1 = Integer.parseInt(in.readLine());
        System.out.println("Enter no of rows and columns of second matrix: ");
        r2 = Integer.parseInt(in.readLine());
        c2 = Integer.parseInt(in.readLine());
        if(c1 == r2)
        {
            A = new int[r1][c1];
            B = new int[r2][c2];
            C = new int[r1][c2];
            System.out.println("Enter elements of first matrix:");
            for(i=0; i<r1; i++)
                for(j=0; j<c1; j++)
                {
                    A[i][j] = Integer.parseInt(in.readLine());
                }
            System.out.println("Enter elements of second matrix:");
            for(i=0; i<r2; i++)
                for(j=0; j<c2; j++)
                {
                    B[i][j] = Integer.parseInt(in.readLine());
                }
            
            System.out.println("Multiplied matrix:");
            for(i=0; i<r1; i++)
            {
                for(j=0; j<c2; j++)
                {
                    C[i][j] = 0;
                    for (k = 0; k<r2; k++) 
                    {
                        C[i][j] += A[i][k] * B[k][j];
                    }
                    System.out.print(C[i][j] +" ");
                }
                System.out.println();
            }
        }
        else
            System.out.println("Matrices cannot be multiplied");
    }
} 