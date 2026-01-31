package com.example.uberprojectentityservice.models;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.Random;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Otp extends BaseModel{

    private String code;

    private String sentToNumber;

    public static Otp make(String phoneNumber){
        Random rand = new Random();
        Integer code = rand.nextInt(9999) + 1000;
        return Otp.builder().code(code.toString()).sentToNumber(phoneNumber).build();
    }

}