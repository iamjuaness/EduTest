package src.main.java.com.edutest.auth.models;

import jakarta.persistence.*;
import lombok.Data;

/**
 * Model class for managing users.
 */
@Entity
@Table(name = "users")
@Data
public class User {
    // Attributes of the user
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer user_id;

    @Column(nullable = false)
    private String first_name;

    @Column(nullable = false)
    private String last_name;

    @Column(unique = true, nullable = false)
    private String user_email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private Role role_id;
}

