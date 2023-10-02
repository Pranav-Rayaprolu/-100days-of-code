import java.util.*;
public class Two_D_Arrays{
    public static void main(String[] args) {
        //creation
        Scanner sc= new Scanner(System.in);
        int a[][]= new int[2][3];
        // no of elemnts in the two d array is row*col ie 2*3 = 6 here
        //direct giving
        int b[][]= {{1,2,3},{2,4,5},{1,2,3}};
        //this is array b of size 3*3;
        //taking input
        //outer loop for rows and inner loop for columns
        //rows = matrix.length
        //columns = matrix[0].length
        int rows= 3;
        int col =3;
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                System.out.print("enter your element");
                b[i][j]= sc.nextInt();
            }
        }
        //printing a 2d matrix
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                System.out.print( b[i][j]+" ");
                
            }
            System.out.println();
        }
    }
}