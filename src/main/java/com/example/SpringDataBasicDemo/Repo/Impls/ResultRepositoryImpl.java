package com.example.SpringDataBasicDemo.Repo.Impls;

import com.example.SpringDataBasicDemo.Domains.Result;
import com.example.SpringDataBasicDemo.Repo.ResultRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ResultRepositoryImpl extends BaseRepo<Result> implements ResultRepository {
}