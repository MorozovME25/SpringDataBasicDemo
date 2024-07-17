package com.example.SpringDataBasicDemo.Repo.Impls;

import com.example.SpringDataBasicDemo.Domains.Theme;
import com.example.SpringDataBasicDemo.Repo.ThemeRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ThemeRepositoryImpl extends BaseRepo<Theme> implements ThemeRepository {
}