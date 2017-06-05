package com.AnimalShop;

import sun.applet.Main;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by RENT on 2017-06-05.
 */
public class Managers extends Main {
    public ArrayList<String> getManagerList() {
        return ManagerList;
    }

    public void setManagerList(ArrayList<String> managerList) {
        ManagerList = managerList;
    }

    ArrayList<String> ManagerList = new ArrayList<String>(
            Arrays.asList("Andrew Baker","Lawrence Fishbourne","Kenneth Amber","Martin Kennedy"));

}
