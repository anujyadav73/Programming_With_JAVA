import java.util.*;

public class Hlaf_Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i=1; i<=n ; i++ ){

            for (int j=1; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Inverse Pyramid

//        for(int i=n; i>=1; i--){
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // Inverted Half Pyramid

        //Outer Loop
//        for(int i=1; i<=n; i++){
//
//            //Inner loop --> Space print
//            for(int j=1; j<=n-i; j++){
//                System.out.print(" ");
//            }
//
//            //Inner loop --> Star print
//            for(int  j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }
}
