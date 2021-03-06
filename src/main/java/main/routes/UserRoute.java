package main.routes;

import com.google.gson.Gson;
import main.services.UserService;

import static spark.Spark.*;


public class UserRoute {

    private static UserService userService;

    static {
        userService = new UserService();
    }

    public static void configureUserRoutes(Gson gson) {
        path("/api/users", () -> {
            get("", (request, response) -> {
                response.type("application/json");
                return gson.toJson(userService.findAllUsers());
            });
            post("", (request, response) -> {
                response.type("application/json");
                return gson.toJson(userService.save(request, gson));
            });
            get("/:id",  (request, response) -> {
                response.type("application/json");
                return gson.toJson(userService.getUserById(Long.valueOf(request.params("id"))));
            });
        });
    }
}
