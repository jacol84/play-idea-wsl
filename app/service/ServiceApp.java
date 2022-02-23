package service;

import java.util.Date;
import com.google.gson.Gson;

import play.Logger;

public class ServiceApp {
    public int add(int a, int b) {

        String s = new Gson().toJson(new Date());
        Logger.info(s);
        Logger.info(s);
        Logger.info(s);
        return a + b;
    }
}
