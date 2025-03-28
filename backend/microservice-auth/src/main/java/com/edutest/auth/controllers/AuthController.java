package src.main.java.com.edutest.auth.controllers;

import org.springframework.web.bind.annotation.*;
import src.main.java.com.edutest.auth.models.User;
import src.main.java.com.edutest.auth.services.UserService;
import java.util.Optional;

/**
 * Controller class for managing users.
 */
@RestController
@RequestMapping("/auth")
public class AuthController {

    // Instance of the UserService class
    private static UserService userService;

    /**
     * Constructor for the AuthController class.
     * @param userService The UserService instance.
     */
    public AuthController(UserService userService) {
        AuthController.userService = userService;
    }
    /**
     * Returns a user by its email.
     * @param email The email of the user to be found.
     * @return The found user, if any.
     */
    @GetMapping("/user/{email}")
    public Optional<User> getUserByEmail(@PathVariable String email) {
        return userService.findUserByEmail(email);
    }

    /**
     * Registers a new user.
     * @param user The user to be registered.
     * @return The registered user.
     */
    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        return userService.saveUser(user);
    }
}
