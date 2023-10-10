package Functions;

public class FuncOverloading {

    // Function for first To calculate sum
    public static int sum(int a, int b){
        return a+b ;
    }
    // Function for second To calculate sum
    public static int sum(int a, int b ,int c){
        return a+b+c ;
    }

    // Now Calling Function
    public static void main(String[] args) {
        System.out.println(sum(5,6));
        System.out.println(sum(5,3,8));
    }
}
