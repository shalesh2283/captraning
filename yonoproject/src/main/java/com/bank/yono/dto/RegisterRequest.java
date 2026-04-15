package com.bank.yono.dto;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class RegisterRequest {

    @NotBlank
    private String username;

    @NotBlank
    private String password;

    @Email
    private String email;

    @Pattern(regexp = "\\d{10}")
    private String mobile;

    private double initialDeposit;
}
