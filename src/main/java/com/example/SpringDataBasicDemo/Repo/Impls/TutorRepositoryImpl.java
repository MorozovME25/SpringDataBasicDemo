package com.example.SpringDataBasicDemo.Repo.Impls;

import com.example.SpringDataBasicDemo.Domains.Tutor;
import com.example.SpringDataBasicDemo.Repo.TutorRepository;
import org.springframework.stereotype.Repository;

@Repository
public class TutorRepositoryImpl extends BaseRepo<Tutor> implements TutorRepository {
}