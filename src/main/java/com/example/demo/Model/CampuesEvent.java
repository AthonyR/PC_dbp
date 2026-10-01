package com.example.demo.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;

@Entity
@Table(name = "CampusEvents")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CampuesEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @ManyToOne
    @JoinColumn(name = "User_id",nullable = false)
    private User organizerld;
    @Column(unique = true)
    private String title;

    private String description;
    @Column(nullable = false)
    private String category="ACADEMIC";
    @Column(nullable = false)
    private ZonedDateTime eventDate;
    @Column(nullable = false)
    private String location;
    @Column(nullable = false)
    private String status;

}
