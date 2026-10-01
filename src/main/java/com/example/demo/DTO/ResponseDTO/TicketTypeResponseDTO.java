package com.example.demo.DTO.ResponseDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TicketTypeResponseDTO {
    private Long id;
    private String eventid;
    private String eventTitle;
    private String TicketTYPE;
    private String attendeeUsername;
    private String status;
}
