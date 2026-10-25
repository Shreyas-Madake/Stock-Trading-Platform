package com.trading.userservice.dto;

import com.trading.userservice.entity.UserStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
 // this dto is used to send the response to the client when a user is created or fetched from the database. It contains the user's id, email, first name, last name, wallet balance, status, and created at timestamp.
public class UserResponse {

    private String id;
    private String email;
    private String firstName;
    private String lastName;
    private BigDecimal walletBalance;
    private UserStatus status;
    private LocalDateTime createdAt;
}
