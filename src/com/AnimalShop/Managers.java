package com.AnimalShop;

import sun.applet.Main;

import java.util.HashMap;

/**
 * Created by RENT on 2017-06-05.
 */
public class Managers extends Main {

    public HashMap<String ,Object > getManagerList() {
        return ManagerList;
    }

    public void setManagerList(HashMap<String, Object> managerList) {
        ManagerList = managerList;
    }

    private HashMap<String,Object> ManagerList = new HashMap<>();




}
