package src.main.java.com.edutest.auth.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import src.main.java.com.edutest.auth.models.User;

/**
 * Repository class for managing users.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    /**
     * Finds a user by its email.
     * @param email The email of the user to be found.
     * @return The found user, if any.
     */
    User findByUser_email(String email);
}

