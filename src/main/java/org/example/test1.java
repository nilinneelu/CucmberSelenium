package org.example;

import java.util.ArrayList;
import java.util.List;

public class test1 {

    public static void main(String[] args) {

        List<String> country= new ArrayList<>();
        country.add("India");
        country.add("New Zealand");
        country.add("Korea");
        for(int i=0;i<country.size();i++){
            String countryStr= country.get(i);
            int length= countryStr.length();
            char lc=countryStr.charAt(length-1);
            System.out.print(lc+" ");
        }


    }




}
