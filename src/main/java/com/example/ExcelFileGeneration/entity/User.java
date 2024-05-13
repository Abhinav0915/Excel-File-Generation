package com.example.ExcelFileGeneration.entity;

// Import necessary annotations and classes from Jakarta Persistence
import jakarta.persistence.*;
// Import annotations and classes from Lombok for convenient boilerplate code generation
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// Declare the class as a JPA entity, representing a table in the database
@Entity

@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
@Getter
@Setter
public class User {

    @Id
    @Column(name = "userId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    @Column(name = "userName")
    private String userName;
    @Column(name = "city")
    private String city;
    @Column(name = "email")
    private String email;


}
