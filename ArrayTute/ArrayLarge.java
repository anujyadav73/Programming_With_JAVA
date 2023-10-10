package ArrayTute;

 //            FINDING  LARGEST VALUE & SMALLEST VALUE IN ARRAY

import java.util.*;
public class ArrayLarge {

    public static int getlargest(int numbers[]){
        int largest = Integer.MIN_VALUE; // It shows - infinity

        int smallest = Integer.MAX_VALUE; // it shows +infinity & give smallest number in array

        for(int i = 0 ; i<numbers.length; i++){
            // For getting largest number
            if(largest < numbers[i]){
                largest = numbers[i];
            }
            // For getting Smallest number
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }

        }
        System.out.println("Smallest value is : " + smallest);
        return largest;

    }

    public static void main(String[] args) {
        int numbers[] = {2,5,6,1,9,8,3,4,7};
        System.out.println("largest value is : " + getlargest(numbers));
    }
}
