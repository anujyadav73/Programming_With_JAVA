package ArrayTute;

public class ArrayBinSear {

    public static int binarysearch(int numbers[] , int key){
        int start = 0 , end = numbers.length-1;   // first we give start value & end value

        while (start <= end){
            int mid = (start + end) / 2 ;

            // Now Comparison
            if (numbers[mid] == key){                 // FOUND CONDITION
                return mid ;
            }
            if (numbers[mid] < key){            // This is an RIGHT CASE
                start = mid + 1 ;
            }else {                             // This is an LEFT CASE
                end = mid - 1 ;
            }
        }
        return -1 ;                       // KEY NOT EXIST IN ARRAY
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4 , 6 , 7 , 9 , 10 , 13 , 15 , 18 } ;
        int key = 10 ;

        System.out.println("index for key is : " + binarysearch(numbers , key));
    }
}
