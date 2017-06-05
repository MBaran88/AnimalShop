package com.AnimalShop;

import com.sun.org.apache.regexp.internal.RE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Shop {

    public static void main(String[] args) {
        Boolean IsShopOpen;
        while (IsShopOpen = true){
        //Starting the app
        //Initializing cats hashmap
        Cats CL = new Cats();
        HashMap<Integer,String> CatList = CL.getCatList();
        //Initializing lizard hashmap
        Lizards LL = new Lizards();
        HashMap<Integer,String> LizardList = LL.getLizardList();
        //Initializing Log stash
        OperationsLogs OL = new OperationsLogs();
        ArrayList Log = OL.getLog();
        //Initializing Managers list
        Managers ML = new Managers();
        HashMap MLManagerList = ML.getManagerList();
        MLManagerList.put("Baker","Andrew");
        MLManagerList.put("Fishbourne","Lawrence");
        MLManagerList.put("Amber","Kenneth");
        MLManagerList.put("Kennedy","Martin");
        //Printing names and number of Managers
        System.out.println("How many managers are there?");
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        int n = reader.nextInt(); // Scans the next token of the input as an int.
            reader.close();
            System.out.println("There are " + n + " Managers");
        System.out.println("Type surname and name of each Manager:");
        Scanner reader2 = new Scanner(System.in);
        String m = reader.next();
            reader.close();

        System.out.println("----------------------------------------");
        //Initializing Retail Workers List
        RetailsWorkers RW = new RetailsWorkers();
        HashMap RetailWorkerList = RW.getRetailWorkerList();
        RetailWorkerList.put("Dudikoff","Michael");
        RetailWorkerList.put("Seagal","Steven");
        RetailWorkerList.put("Johnson","Dwayne");
        RetailWorkerList.put("Gustaffson","Alexander");
        RetailWorkerList.put("Baller","Andrew");
        //Printing names and number of Retail Workers
        System.out.println("How many retail workers are there?");
        System.out.println("There are " + RW.getRetailWorkerList().size() + " Retail workers");
        System.out.println("Names " + RW.getRetailWorkerList());


        }
    }
}

