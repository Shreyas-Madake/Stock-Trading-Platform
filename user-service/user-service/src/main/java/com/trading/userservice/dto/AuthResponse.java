package com.trading.userservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
// this dto is used to send the response after successful authentication, it contains the user details and the access and refresh tokens
// it is sent to the client after successful authentication
public class AuthResponse {

    private String userId;
    private String email;
    private String firstName;
    private String lastName;
    private BigDecimal walletBalance;

    private String accessToken;
    private String refreshToken;
    private String tokenType = "Bearer";
}
