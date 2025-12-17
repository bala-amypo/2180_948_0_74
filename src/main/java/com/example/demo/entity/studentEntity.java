package com.example.demo.entity;

import jakarta.persistance.*;

@Entity
public class studentEntity{
    @Id
    @generatedValue(strategy=Generationtype.IDENTITY)
    private long id;

    @NotBlank
    private String name;

    @Email(message"Name is not Valid")
    private String email;
    public studentEntity()
    {

    }
    public studentEntity(long id,String name,String email)
    {
        this.id=id;
        this.name=name;
        this.email=email;
    }
}