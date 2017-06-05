package com.AnimalShop;

import java.util.HashMap;

/**
 * Created by RENT on 2017-06-05.
 */
public class Cats extends Shop {
    private HashMap<Integer,String> CatList = new HashMap<Integer,String>();
    public HashMap<Integer,String> getCatList(){
        return CatList;
    }
}
