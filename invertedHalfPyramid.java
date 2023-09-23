
import java.util.*;
public class invertedHalfPyramid{
 /* 
  * * *
  * * 
  *
  */
public static void main(String[] args) { 
        Scanner sc =new Scanner(System.in);
        System.out.println("enter n");
        int n =4;
        for(int i=0;i<=n;i++){       //for(int i=n;i>=1;i--)
            for(int j=n-i;j>=1;j--){ //for(j=1;j<i;j++)
               System.out.print(" * ");
            }
            System.out.println();
        }
    }
}

