package com.trading.userservice.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest {
    // DTO is used to transfer data between the client and server. It encapsulates the data required for user registration.
    // it is used to get the data from the client and pass it to the server.
    // it is also used for getter and setter methods. It is a simple Java class that contains fields and their corresponding getter and setter methods.


    @NotBlank(message = "Email is required")// this is when email is blank or null, it will throw an error message "Email is required"
    @Email(message = "Invalid email format")// this is when email is not in the correct format, it will throw an error message "Invalid email format"
    private String email;

    @NotBlank(message = "Password is required")
    @Size(min = 6, message = "Password must be at least 6 character long")
    private String password;

    @NotBlank(message = "First name is required")
    private String firstName;

    @NotBlank(message = "Last name is required")
    private String lastName;

    private BigDecimal initialDeposit = BigDecimal.valueOf(10000);
}
