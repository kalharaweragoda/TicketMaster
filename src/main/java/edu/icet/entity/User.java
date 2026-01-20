package edu.icet.entity;

import edu.icet.enums.UserTire;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private UserTire tire;

    @NotBlank(message = "Email is required")
    @Column(unique = true)
    private String email;

    private final LocalDate createdAt = LocalDate.now();
}
