package CompanyTest;
import java.util.*;
import java.lang.*;
public class Test8 {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc= new Scanner(System.in);
        //int n= sc.nextInt();
        int i, j, row =10;
        for(  i=0; i<row;i++){
            for(j=row-i; j>1; j--){
                System.out.print(" ");
            }
            for(j=0; j<=i; j++){
                System.out.print("*" + " ");
            }
            System.out.println( );
        }
    }

}

