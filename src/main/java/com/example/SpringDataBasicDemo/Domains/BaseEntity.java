package com.example.SpringDataBasicDemo.Domains;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class BaseEntity {
    private Integer id;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }
}
