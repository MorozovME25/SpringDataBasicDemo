package com.example.SpringDataBasicDemo.Repo.Impls;

import com.example.SpringDataBasicDemo.Domains.Student;
import com.example.SpringDataBasicDemo.Repo.StudentRepository;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepositoryImpl extends BaseRepo<Student> implements StudentRepository {
}