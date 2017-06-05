package com.AnimalShop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;



public class Shop {

    public static void main(String[] args) {
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
        //Checking the type of a worker

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String readValue = null;

        System.out.println("Type retail or manager to continue: ");
        try {
            readValue = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

       int WorkerIDInt = Integer.parseInt(readValue);
    }
}
