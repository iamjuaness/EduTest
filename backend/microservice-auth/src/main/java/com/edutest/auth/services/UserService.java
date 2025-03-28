package src.main.java.com.edutest.auth.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import src.main.java.com.edutest.auth.models.User;
import src.main.java.com.edutest.auth.repositories.UserRepository;
import java.util.Optional;

/**
 * Service class for managing users.
 */
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    /**
     * Finds a user by its email.
     * @param email The email of the user to be found.
     * @return The found user, if any.
     */
    public Optional<User> findUserByEmail(String email) {
        return Optional.ofNullable(userRepository.findByUser_email(email));
    }

    /**
     * Saves a user in the database.
     * @param user The user to be saved.
     * @return The saved user.
     */
    public User saveUser(User user) {
        return userRepository.save(user);
    }
}
