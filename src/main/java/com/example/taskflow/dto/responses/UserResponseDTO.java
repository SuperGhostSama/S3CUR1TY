package com.example.taskflow.dto.responses;

import com.example.taskflow.domain.User;

public record UserResponseDTO(
        String firstName,
        String lastName,
        String email,
        String role
) {
    public static UserResponseDTO fromUser(User user){
        return new UserResponseDTO(
                user.getFirstName(),
                user.getLastName(),
                user.getEmail(),
                user.getRole().getName()
        );
    }
}
