package service;

import java.util.ArrayList;
import java.util.Date;
import com.google.common.collect.Lists;
import com.google.gson.Gson;

import play.Logger;

public class ServiceApp {
    public int add(int a, int b) {
        ArrayList<Object> objects = Lists.newArrayList();
        String s = new Gson().toJson(new Date());
        Logger.info(s);
        Logger.info(s);
        Logger.info(s);
        return a + b;
    }
}
