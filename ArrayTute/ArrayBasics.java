package ArrayTute;

import java.util.Scanner;

public class ArrayBasics {
    public static void main(String[] args) {
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);

        System.out.println(marks.length);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        System.out.println("Phy = " + marks[0]);
        System.out.println("Chem = " + marks[1]);
        System.out.println("Math = " + marks[2]);

        // Calculate Percentage of the marks

        System.out.println("Total Percentage of Obtain Marks = " + (marks[0] + marks[1] + marks[2]) / 3);
    }
}
