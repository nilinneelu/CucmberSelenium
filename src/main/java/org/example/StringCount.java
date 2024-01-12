package org.example;

import java.util.Scanner;

public class StringCount {

    public static void main(String[] args) {

        int j = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        System.out.println("Entered String is " + str);
        System.out.println("Enter the character to verify");
        char ch = sc.next().charAt(0);
        System.out.println("The character is joshma" + ch);
        for (int i = 0; i < str.length() - 1; i++) {
            if (ch == str.charAt(i))
                j = j + 1;

        }

        if (j < 0) {
            System.out.println("There are no charcters");
        } else {

            System.out.println("The charter count is " + j);
        }
    }
}
