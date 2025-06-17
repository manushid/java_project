// Write a program to search for a specific value in a 2D array and print its position (row and column). 
//If the value is not found, print "Not Found."
import java.util.Scanner;
public class array2D
{
    public static void main(String[] args) 
    {
        int[][] a = {
            {4,8},
            {7,1},
        }; 

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number to search: ");
        int s= sc.nextInt();

        int row=-1;
        int col=-1;
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a[i].length; j++)
            {
                if(a[i][j]==s)
                {
                    row=i;
                    col=j;
                    break;
                }
            }
            if(row!=-1)
            {
                break;
            }
        }
        if(row!=-1 && col!=-1)
        {
            System.out.println("The number is at row "+row + " and at column "+col);
        }
        else
        {
            System.out.println("Number not found!");
        }
    }    
}
