package com.example.demo.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "TicketTypes")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TicketType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @ManyToOne
    @JoinColumn(name = "CampuesEvent_id")
    private CampuesEvent campuesid;
    @Column(nullable = false)
    private String name;
    private Integer capacity;
    private Integer registeredCount=0;
    @Column(nullable = false)
    private String status;
}
