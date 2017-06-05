package com.AnimalShop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;



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
        ArrayList MLManagerList = ML.getManagerList();
        //Printing names and number of Managers
        System.out.println("How many managers are there?");
        System.out.println("There are " + MLManagerList.size() + " Managers");
        System.out.println("Names " + ML.getManagerList());
        System.out.println("----------------------------------------");
        //Initializing Retail Workers List
        RetailsWorkers RW = new RetailsWorkers();
        ArrayList RetailWorkerList = RW.getRetailWorkerList();
        //Printing names and number of Retail Workers
        System.out.println("How many retail workers are there?");
        System.out.println("There are " + RW.getRetailWorkerList().size() + " Retail workers");
        System.out.println("Names " + RW.getRetailWorkerList());
    }
    }
}

