package com.AnimalShop;

import sun.applet.Main;

import java.util.ArrayList;

/**
 * Created by RENT on 2017-06-05.
 */
public class OperationsLogs extends Main {
    public ArrayList getLog() {
        return Log;
    }

    public void setLog(ArrayList log) {
        Log = log;
    }

    ArrayList Log = new ArrayList<>();
}
