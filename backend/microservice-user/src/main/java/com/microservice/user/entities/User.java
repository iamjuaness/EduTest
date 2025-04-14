package com.microservice.user.entities;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    private int id;
    private String name;
    private String lastName;
    private String email;
    private String password;
    private String role;
    private int courseId;
}
