package ArrayTute;

import java.util.*;
// Linear Search

public class ArrayLS {
    public static int linearSearch(int numbers[] , int key){

        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return  -1 ;
    }
    public static void main(String[] args) {
        // giving number as array
        int numbers[] = {2, 4, 6, 8,10 ,12, 14, 16};
        int key =16;                                      // if we provide key = 20 : it shows not found .\
        int index = linearSearch(numbers, key);
        if(index == -1){
            System.out.println("Not found");
        }else{
            System.out.println(" Key is at index : " + index);
        }
        System.out.println();
    }
}