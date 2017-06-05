package com.AnimalShop;

import java.util.HashMap;

/**
 * Created by RENT on 2017-06-05.
 */
public class RetailsWorkers {
    public HashMap<String, Object> getRetailWorkerList() {
        return RetailWorkerList;
    }

    public void setRetailWorkerList(HashMap<String, Object> retailWorkerList) {
        RetailWorkerList = retailWorkerList;
    }

    private HashMap<String,Object> RetailWorkerList = new HashMap<String,Object>();
}
