package main.services;

import com.google.gson.Gson;
import main.entities.User;
import main.repositories.Repository;
import main.repositories.UserRepository;
import spark.Request;

import java.util.List;

public class UserService {
    private Repository<Long, User> repository;

    public UserService() {
        this.repository = new UserRepository();
    }

    public List<User> findAllUsers(){
        return repository.findAll();
    }

    public User save(Request request, Gson gson) {

        User user = gson.fromJson(request.body(), User.class);
        System.out.println(user.toString());
        return repository.save(user);
    }
}
