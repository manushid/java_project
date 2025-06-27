// addition of 2 3D arrays
import java.util.Scanner;

public class array3dcode
{
    public static void main(String[] args)
    {
        int[][][] arr= new int [2][2][2];
        int[][][] arr1= new int [2][2][2];
        int[][][] sum= new int [2][2][2];
        Scanner sc= new Scanner(System.in);

        for( int i=0; i< arr.length; i++)
        {
           for(int j=0; j< arr[i].length; j++)
           {
                for(int k=0; k<arr[i][j].length; k++)
                {
                    System.out.println("Value for arr ["+i+"]["+j+"]["+k+"]");
                    arr[i][j][k]= sc.nextInt();
                }
            }
        }

        System.out.println("Array 1 is :");
        for( int i=0; i< arr.length; i++)
        {
           for(int j=0; j< arr[i].length; j++)
           {
                for(int k=0; k<arr[i][j].length; k++)
                {
                    System.out.print( " "+arr[i][j][k]);
                }
                System.out.println(" ");
            }
            System.out.println();
        }
        

        // Array 2
        for( int i=0; i< arr1.length; i++)
        {
           for(int j=0; j< arr1[i].length; j++)
           {
                for(int k=0; k<arr1[i][j].length; k++)
                {
                    System.out.println("Value for arr2 ["+i+"]["+j+"]["+k+"]");
                    arr1[i][j][k]= sc.nextInt();
                }
            }
        }

        System.out.println("Array 2 is :");
        for( int i=0; i< arr1.length; i++)
        {
           for(int j=0; j< arr1[i].length; j++)
           {
                for(int k=0; k<arr1[i][j].length; k++)
                {
                    System.out.print( " " +arr1[i][j][k]);
                }
                System.out.println(" ");
            }
            System.out.println();
        }



        //sum
        for( int i=0; i< arr.length; i++)
        {
           for(int j=0; j< arr[i].length; j++)
           {
                for(int k=0; k<arr[i][j].length; k++)
                {
                    sum[i][j][k] = arr[i][j][k] + arr1[i][j][k];
                }
            }
        }
        System.out.println("sum is :");

        for( int i=0; i< sum.length; i++)
        {
           for(int j=0; j< sum[i].length; j++)
           {
                for(int k=0; k<sum[i][j].length; k++)
                {
                    System.out.print( " "+sum[i][j][k]);
                }
                System.out.println(" ");
            }
            System.out.println();
        }
    }
}