package com.example.TestingApplicaton1.repo;

import com.example.TestingApplicaton1.model.Movies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoMovie extends JpaRepository<Movies, Long> {
}
