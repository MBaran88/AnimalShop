package com.AnimalShop;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by RENT on 2017-06-05.
 */
public class RetailsWorkers {
    public ArrayList<String> getRetailWorkerList() {
        return RetailWorkerList;
    }

    public void setRetailWorkerList(ArrayList<String> retailWorkerList) {
        RetailWorkerList = retailWorkerList;
    }

    ArrayList<String> RetailWorkerList = new ArrayList<String>(
            Arrays.asList("Michael Dudikoff","Steven Seagal","Dwayne Johnson","Alexander Gustaffson","Andrew Baller")
    );
}
