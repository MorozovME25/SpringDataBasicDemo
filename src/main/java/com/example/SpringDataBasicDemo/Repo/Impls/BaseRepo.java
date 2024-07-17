package com.example.SpringDataBasicDemo.Repo.Impls;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public abstract class BaseRepo<Entity> {

    @PersistenceContext
    protected EntityManager entityManager;
}