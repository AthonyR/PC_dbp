package com.example.demo.DTO.ResponseDTO;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateEventResponseDTO {
    private Long id;
    private String organizerUsername;
    private String category;
    private String status;
}
