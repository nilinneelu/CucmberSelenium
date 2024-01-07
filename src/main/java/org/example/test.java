package org.example;

public class test {

    public static void main(String[] args) {

      float number= 12400897;
     int count=0;
      while(number!=0){

          int j= (int) (number%10);
          if(j==0)
            count=  count+1;
          number= number/10;

                }

      System.out.println("The count is"+count);
    }


}
