package main.routes;

import com.google.gson.Gson;
import main.services.UserService;

import static spark.Spark.*;


public class UserRoute {

    private static UserService userService;

    static {
        userService = new UserService();
    }

    public static void configureUserRoutes(Gson gson){
        path("/api/users", () -> {
            get("", (request, response) -> userService.findAllUsers(), gson::toJson);
            post("", (request, response) -> userService.save(request, gson), gson::toJson);
        });
    }
}
