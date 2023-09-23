import java.util.*;

public class hallowRectangle {
    /* 
     check for outer cell values either i=1 or i= n for rows
     and same goer for columns
      11 12 13
      21 22 23
      31 32 33
     */
    public static void main(String[] args) { 
        Scanner sc =new Scanner(System.in);
        System.out.println("enter n");
        int n =sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||j==1||i==n||j==n){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
