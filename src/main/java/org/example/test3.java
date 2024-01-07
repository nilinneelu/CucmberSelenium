package org.example;

public class test3 {

    public static void main(String[] args) {

        String name= "Nilin";
        String reverse="";
        char temp;
        for(int i=name.length()-1; i>=0;i--){
            temp=name.charAt(i);
            reverse=reverse+temp;

        }
        System.out.println("Reverse of string is "+reverse);
        if(name.equalsIgnoreCase(reverse))
        {
            System.out.println("The string is palindrome");
        }
        else
            System.out.println("The String is not palindrome");

        
    }
}
