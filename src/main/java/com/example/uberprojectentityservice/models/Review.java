package com.example.uberprojectentityservice.models;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Review extends BaseModel{

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private double rating;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(nullable = false)
    private Booking booking;
    
}