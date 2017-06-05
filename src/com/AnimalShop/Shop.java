package com.AnimalShop;

import java.util.HashMap;
import java.util.Scanner;


public class Shop {

    public static void main(String[] args) {
        //Adding cats to the shop
        Cats CL = new Cats();
        HashMap<Integer,String> CatList = CL.getCatList();
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter your Worker ID ");
        int n = reader.nextInt(); // Scans the next token of the input as an int.
        
    }
}
