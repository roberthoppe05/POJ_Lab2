package com.company.Zad2_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {


    public static void main(String[] args) throws IOException {
        int number;
        boolean num;
        System.out.println("podaj dowolna liczbe:");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        number = Integer.parseInt(br.readLine());

        if (number % 2 == 0) {
            num = true;
            System.out.println(number + " jest parzysta");
        }else
            num = false;
            System.out.println(number+" jest nieparzysta");


    }


}
