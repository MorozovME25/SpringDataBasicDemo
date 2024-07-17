package com.example.SpringDataBasicDemo.Repo.Impls;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public abstract class BaseRepo<Entity> {

    @PersistenceContext
    protected EntityManager entityManager;
}
