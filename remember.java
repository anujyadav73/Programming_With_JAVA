public class remember {
    public static void main(String[] args) {
        int n = 10 ;

        // Outer loop of 1st part i.e. upper part of diamond

        for(int i=1; i<=n; i++){
            // loop for print Space
            for(int j=1; j<= (n-i)  ; j++){
                System.out.print(" ");
            }

            // loop for print " * " for diamond
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // Outer loop of 2nd part i.e. lower part of diamond

        for(int i=n; i>=1; i--){

            // loop for print Space
            for(int j=1; j<= (n-i) ; j++){
                System.out.print(" ");
            }
            // loop for print " * " for diamond

            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

