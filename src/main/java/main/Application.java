package main;

import com.google.gson.Gson;
import main.routes.UserRoute;

public class Application {
    public static void main(String[] args) {
        Gson gson = new Gson();
        UserRoute.configureUserRoutes(gson);
    }
}
