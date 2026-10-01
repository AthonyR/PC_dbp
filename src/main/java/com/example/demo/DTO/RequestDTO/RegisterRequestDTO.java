package com.example.demo.DTO.RequestDTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequestDTO {
    @NotBlank
    private String username;
    @NotBlank
    @Email(message ="Requerimos de un Email con la terminacion @Utec.edu.pe")
    private String email;
    @NotBlank
    @Size(min = 8)
    private String password;

}
