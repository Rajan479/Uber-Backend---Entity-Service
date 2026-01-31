package com.example.uberprojectentityservice.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class PassengerReview extends Review{

    // // we do not give column as nullable because user have the choice of making review or not
    private String passengerComment;

    private double rating;

}