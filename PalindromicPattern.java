public class PalindromicPattern {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1; i<=n; i++){
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }

            //1st half numbers
            for(int j=1; j>=i; j--){
                System.out.print(j);
            }
            // 2nd half numbers

            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
