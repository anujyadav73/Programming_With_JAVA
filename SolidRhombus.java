public class SolidRhombus {
    public static void main(String[] args) {
        int n = 5;
        // Outer Loop
        for(int i=1; i<=n; i++){
            // Print Space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // Print Star ( * )
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
