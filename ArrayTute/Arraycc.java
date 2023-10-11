package ArrayTute;

import java.util.Scanner;

public class Arraycc {
    public static void main(String[] args) {
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks");

        marks[0]= sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2]= sc.nextInt();

//        System.out.println("Enter marks");
        System.out.println("Phy" + " " + marks[0]);
        System.out.println("Math" + " " + marks[1]);
        System.out.println("Chemistry" + " " + marks[2]);
    }
}
