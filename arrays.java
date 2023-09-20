import java.util.*;
public class arrays {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        //array size is static its size cant be changed in the runtime
        //creation
        int a[]= new int[5];
        //finding length of an array
        int x=a.length;
        //  how to give input  x
        for(int i=0;i<x;i++){
            System.out.println("enter the number");
            a[i]=sc.nextInt();
        }
        //how to get an output
         for(int i=0;i<x;i++){
            System.out.print(a[i]+" ");
            
        }
        //this gives the hashcode of the given array
        System.out.println(a);



} 
}
