public class ButterflyPattern {
    public static void main(String[] args) {

        int n = 5 ;

        //Upper Part
            for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            // Space's
            int space = 2*(n-i);

            for(int j=1; j<=space; j++ ){
                System.out.print(" ");
            }

            // 2nd part

            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //Lower Part
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            // Space's
            int space = 2*(n-i);

            for(int j=1; j<=space; j++ ){
                System.out.print(" ");
            }

            // 2nd part

            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
