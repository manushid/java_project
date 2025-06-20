public class array3D 
{
    public static void main(String[] args) 
    {
         int[][][] arr= {
            {                   
                {4,7,9},   // layer 1
                {5,2,0}
            },
            {
                {6,3,1}   // layer 2
            }
         };   

         for( int i=0; i< arr.length; i++)
         {
            for(int j=0; j< arr[i].length; j++)
            {
                for(int k=0; k<arr[i][j].length; k++)
                {
                    System.out.print(arr[i][j][k] +" ");
                }
                System.out.println();
            }
            System.out.println();
         }
    }    
}
