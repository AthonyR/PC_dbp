package com.example.demo.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;

@Entity
@Table(name = "EventRegistrations")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EventRegistration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @ManyToOne
    @JoinColumn(name = "CampuesEvent_id",nullable = false)
    private CampuesEvent eventid;
    @ManyToOne
    @JoinColumn(name = "TicketType_id",nullable = false)
    private TicketType ticketTypeid;
    @ManyToOne
    @JoinColumn(name = "User_id",nullable = false)
    private User attendeeld;
    @Column(nullable = false)
    private ZonedDateTime registeredAT;
    @Column(nullable = false)
    private String status="CONFIRMED";
}
