package com.company;

public class Main {

    public static void main(String args[]) {

        String FizzBuzz = null;

        for(int counter=1; counter<101; counter++)

        {
            FizzBuzz = "";

            //Print "Fizz" for multiples of 3
            if(counter%3==0)
            {
                FizzBuzz+= "Fizz";
            }

            // Print "Buzz for multiples of 5
            if(counter%5==0)
            {
                FizzBuzz+="Buzz";
            }

            //Convert to string value when displayed
            if(counter%3 != 0 && counter%5 !=0)
            {
                FizzBuzz = Integer.toString(counter);
            }System.out.println(FizzBuzz);
        }
    }
}
